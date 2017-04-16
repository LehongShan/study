package cn.shan.hbase;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by Liao Qiulin 2017/4/1 17:43
 */
public class HbaseUtil {
    private static Connection mConn = null;

    public static Connection getConnection() {
        if (mConn == null) {
            Configuration conf = HBaseConfiguration.create();
            conf.set("hbase.zookeeper.quorum", "192.168.3.7,192.168.3.8,192.168.3.9");
            conf.set("hbase.zookeeper.property.clientPort", "24002");

            try {
                mConn = ConnectionFactory.createConnection(conf);
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

        return mConn;
    }


    public static Put buildPut(String rowKey, Map<String, String> map) {
        Put put = new Put(Bytes.toBytes(rowKey));
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                put.addColumn(Bytes.toBytes("basic_info"), Bytes.toBytes((String) entry.getKey()), Bytes.toBytes((String) entry.getValue()));
            }
        }
        return put;
    }

    public static void insert(String tableName, String rowkey, Map<String, String> values) {
        insert(tableName, buildPut(rowkey, values));
    }

    public static void insert(String tableName, Put put) {
        insert(tableName, put, 3);
    }

    private static void insert(String tableName, Put put, int retry) {
        if (retry >= 0) {
            Table table = null;
            try {
                table = getConnection().getTable(TableName.valueOf(tableName));
                table.put(put);
            } catch (IOException e) {
                e.printStackTrace();
                if (e instanceof RetriesExhaustedWithDetailsException) {
                    insert(tableName, put, retry - 1);
                }
            } finally {
                try {
                    if (table != null) {
                        table.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

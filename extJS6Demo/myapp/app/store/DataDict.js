/**
 * Created by shanlehong on 2017/5/17.
 */
Ext.define('MyApp.store.DataDict', {
    extend: 'Ext.data.Store',
    alias: 'store.datadict',
    storeId:'datadict',
    /*fields:['name','dataType','dataTypeName','dataTypeEnum','dataTypeEnumName','deleteFlg'
    ]*/
    model:Ext.create('MyApp.model.DataDictModel'),
   /* data:{
        items: [
            {name: '1',dataType: "transType",dataTypeName: '交易类型',dataTypeEnum: 'recharge',dataTypeEnumName: '充值',deleteFlg: '0'},
            {name: '2',dataType: 'transType',dataTypeName: '交易类型',dataTypeEnum: 'refund',dataTypeEnumName: '退款',deleteFlg: '0'},
            {name: '3',dataType: 'transType',dataTypeName: '交易类型',dataTypeEnum: 'cash',dataTypeEnumName: '提现',deleteFlg: '0'}
        ]},*/
    proxy:{

        type:'ajax',
        url:'http://192.168.22.232:8080/boot/getDataDict',
        reader:{
            type:'json',
            rootProperty: 'data'
        },
        batchActions: true
    },
    autoLoad: true

});
/**
 * Created by shanlehong on 2017/5/17.
 */
Ext.define('MyApp.view.main.DataDict',{
    extend: 'Ext.grid.Panel',
    title:'datadict',
    alias: 'widget.datadict',
    xtype:'datadictList',
    requires:['MyApp.store.DataDict'],
    controller: 'datadict',
    store: {
        type: 'datadict'
    },
    tbar: [{
        xtype: 'button',
        text: '按钮',
        action:'test'
    }],
    columns: [
        { text: 'dataType',  dataIndex: 'dataType' },
        { text: 'dataTypeName', dataIndex: 'dataTypeName' },
        { text: 'dataTypeEnum', dataIndex: 'dataTypeEnum'},
        { text: 'dataTypeEnumName', dataIndex: 'dataTypeEnumName' }
    ]


});

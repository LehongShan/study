/**
 * Created by shanlehong on 2017/5/17.
 */
Ext.define('MyApp.model.DataDictModel',{
    extend:'Ext.data.Model',
    idProperty: 'extId',
    fields:[
        {name:'id'},
        {name:'dataType'},
        {name:'dataTypeName',type:'string'},
        {name:'dataTypeEnum',type:'string'},
        {name:'dataTypeEnumName',type:'string'},
        {name:'deleteFlg',type:'string'}
    ]
});

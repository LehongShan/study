/**
 * Created by shanlehong on 2017/5/17.
 */
Ext.define('MyApp.controller.DataDictController',{
    extend:'Ext.app.ViewController',
    alias:'controller.datadict',
    control:{
        'datadictWindow button[action=test]':{
            click:function () {
                Ext.create('MyApp.view.main.DataDictWindow', {

                }).show();
            }
        }
    }

});
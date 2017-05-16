/**
 * Created by shanlehong on 2017/5/15.
 */
Ext.define('Car',{
    name:null,
    construcor:function (name) {
        if (name){
            this.name = name;
        }
    },
    start:function () {

        alert('Car started');
    }



});
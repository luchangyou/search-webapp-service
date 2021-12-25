/**
 * Created by Administrator on 2017/10/21.
 */
function searchNextPageGudong(uuid){

    console.log(uuid);
    var pg = +($('#pg').val());
    if(pg=="" || pg == null){
        pg=1;
    }
    console.log("pg====="+pg);
    var data = {
        uuid:uuid,
        pg:pg
    }
    $.ajax({
        url: "gudongList",
        type: "POST",
        data: JSON.stringify(data),
        dataType: "json",
        contentType:"application/json;charset=UTF-8",
        success: function(data){
            console.log(data);
            var html = template('template',{list:data});

            $('#zuzhi2').html(html);

            var p = pg + 1;

            $('#pg').val(p)
        }
    });

}

function onmouseoverSearchGudong(uuid){

    var pg = +($('#pg').val());
    if(pg !=1){
        return;
    }
    var data = {
        uuid:uuid,
        pg:pg
    }
    $.ajax({
        url: "gudongList",
        type: "POST",
        data: JSON.stringify(data),
        dataType: "json",
        contentType:"application/json;charset=UTF-8",
        success: function(data){
            console.log(data);
            var html = template('template',{list:data});

            $('#zuzhi2').html(html);

            var p = pg + 1;

            $('#pg').val(p)
        }
    });

}
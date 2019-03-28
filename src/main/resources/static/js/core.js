/**
 * Created by fangjiejie on 2017/6/24.
 */
function parseAddress(address){//分离参数
    var json={};
    var index=address.lastIndexOf("?");
    var str=address.substring(index+1,address.length);
    var s1=str.split("&")[0];//cate= 代表的是访问具体哪类宠物
    var s2=str.split("&")[1];//action= 代表的是
    json={
        "query":s1.split("=")[1],
        "page":s2.split("=")[1]
    }
    return json;
}
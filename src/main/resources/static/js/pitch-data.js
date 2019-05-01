$(function() {
    $('#zone').on('click', function(e) {
        //画像上でクリックした位置を取得
        console.log('offset=' + e.offsetX + ',' + e.offsetY);
        var x=e.offsetX;
        var y=e.offsetY;

        //位置情報をhtmlに渡す
        $("#text1").val(x);
        $("#text2").val(y);

        //位置情報をCSSに渡す
        $("#zone").find("#ball").css('left',x);
        $("#zone").find("#ball").css('top',y);
        })
});
<%--
  Created by IntelliJ IDEA.
  User: jiangdongcheng
  Date: 16/8/4
  Time: 下午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style type="text/css">
          body{font-size:13px}
          .clsInit{width:435px;height:35px;line-height:35px;padding-left:10px}
          .clsTip{padding-top:5px;background-color:#eee;display:none}
          .btn {border:#666 1px solid;padding:2px;width:65px;float:right;margin-top:6px;margin-right:6px;
              filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#ffffff, EndColorStr=#ECE9D8);}
      </style>
      <script src="js/jquery.js"></script>
    <script>
      $(function(){

          /*
          * 4-1
          * */
//          var intI = 0;   //记录执行次数
//          $('body , div , .btn').click(function(){
//              intI++;
//              $(".clsShow").show().html("您好,欢迎来到jquery的世界!</br>").append("执行次数:"+intI);
//              event.stopPropagation();   //通过此方法可以阻止冒泡.还可以通过语句return false来停止事件冒泡.
//          })

          /*
          * 4-2
          * */
//          $("#btnBind").bind("click",function(){
//              $(this).attr("disabled","disabled");  //按钮不可用.
//          })

          //如果需要绑定多个事件,可以像如下操作.
//          $("#btnBind").bind("click mouseout",function(){
//              $(this).attr("disabled","disabled");
//          })

          /*
          * 4-3  使用映射方式绑定不同的事件
          * */
//          $(".txt").bind({ focus:function(){
//              $("#divTip").html("绑定的是focus事件!");
//          },
//            change:function(){
//                $("#divTip").html("绑定的是change事件!");
//            }
//          })

          /*
          * 4-4 切换事件  jquery中有两个切换事件的方法,一个是hover(),一个是toggle().
          * */
//hover()   $(".clsTitle").hover(function(){
//              $(".clsContent").show();
//          },function(){
//              $(".clsContent").hide();
//          })

//          $("img").toggle(function(){
//              $("img").attr("src","Images/img05.jpg");
//              $("img").attr("title",this.src);
//          },function(){
//              $("img").attr("src","Images/img06.jpg");
//              $("img").attr("title",this.src);
//          },function(){
//              $("img").attr("src","Images/img07.jpg");
//              $("img").attr("title",this.src);
//          })

           /*
           * 4-5 页面移除事件
           * */
//          $("#Button1").click(function(){
//              $("#divTip").append("<div>按钮一的单击事件</div>");
//          })
//          $("#Button2").click(function(){
//              $("#divTip").append("<div>按钮二的单击事件</div>");
//          })
//          $("#Button3").click(function(){
//              $("input").unbind();
//          })

          /*
          * 4-6 其他事件 one()方法和trigger()方法
          * */
//          function btn_One(){ //自定义事件
//            this.value = "010-12345678";
//          }
//          $("input").one("click",btn_One);

//          var text = $("#Text1").val();
//          $("input").trigger("select");
//          $("#divTip").bind("btn_thing",function(){
//              $("#divTip").html(text);
//          })
//          $("#divTip").trigger("btn_thing");
          /*
          * 4-7 文本框中的事件应用   在添加样式的时候,记得先移除样式.
          * */
//          $("#txtEmail").trigger("focus");//默认时文本框获取焦点
//
//          $("#txtEmail").focus(function() {//文本框获取焦点事件
//              $(this).removeClass("txtBlur").addClass("txtInit");
//              $("#email").removeClass("divBlur").addClass("divFocu");
//              $("#spnTip").removeClass("spnBlur")
//                      .removeClass("spnSucc").html("请输入您常用邮箱地址！");
//          })
          /*
          * 4-10 三个下拉列表框
          * */
//          var arrData={
//              厂商1:{品牌一:'型号1-1-1,型号1-1-2',
//                  品牌二:'型号1-2-1,型号1-2-2'},
//              厂商2:{品牌一:'型号2-1-1,型号2-1-2',
//                  品牌二:'型号2-2-1,型号2-2-2'},
//              厂商3:{品牌一:'型号3-1-1,型号3-1-2',
//                  品牌二:'型号3-2-1,型号3-2-2'}
//          };
//
//          function objInit(obj){
//              return $(obj).html('<option>请选择</option>');
//          }
//
//          $.each(arrData,function(pf){
//              $("#selF").append("<option>"+pf+"</option>");
//          })
//
//          $("#selF").change(function(){
//              objInit('#selT');
//              objInit('#selC');
//              $.each(arrData,function(pf,ps){
//                  if($("#selF option:selected").text() == pf){
//                      $.each(ps,function(pt,pc){
//                          $("#selT").append("<option>"+pt+"</option>");
//
//                          $("#selT").change(function(){
//                              objInit("#selC");
//                              $.each(ps,function(pt,pc){
//                                  if($("#selT option:selected").text() == pt){
//                                      $.each(pc.split(","),function(){
//                                          $("#selC").append("<option>"+this+"</option>");
//                                      })
//                                  }
//                              })
//
//                          })
//                      })
//                  }
//              })
//          })



      })

    </script>
  </head>
  <body>
  <div class="clsInit">
      厂商:<select id="selF"><option>请选择</option></select>
      品牌:<select id="selT"><option>请选择</option></select>
      型号:<select id="selC"><option>请选择</option></select>
      <input id="Button1" type="button" value="查询" class="btn" />
  </div>
  <div class="clsInit" id="divTip"></div>
  </body>
</html>

    /*  $("#third").click(function showName()
        {
            var xmlhttp;
            var log = {"event":{"evenType":"1"}};
            if (window.XMLHttpRequest)
            {
                // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlhttp=new XMLHttpRequest();
            }
            else
            {
                // IE6, IE5 浏览器执行代码
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
            alert("test");
            xmlhttp.onreadystatechange=function()
            {
                alert("test");
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    var log =JSON.stringify(log);
                    alert(event.evenType);
                    
                }
            }
            xmlhttp.setRequestHeader('Content-Type','application/json');
            xmlhttp.open("POST","/views/log_out",true);
            xmlhttp.send(log);
        } );
        */

        $("#third").click(function(){  
            alert("test");
        $.ajax({
            type:"POST",
            url:"/views/log_out",
            contentType:"application/json",
            dataType:"json",
            data:JSON.stringify({"event":{"evenType":"1"}}),
            success:function(){
                alert("success");
            },
            error:function(){
                alert("error");
            }
        });
        });  

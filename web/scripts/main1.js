var btnRegister = document.getElementById("btnRegister");
var container = document.getElementById("container");
var loginForm = document.getElementById("loginForm");
var registerForm = document.getElementById("registerForm");
var btnCancel = document.getElementById("btnCancel");
var btnRegisters = document.getElementById("btnRegisters");
var btnLogin = document.getElementById("btnLogin");








btnRegister.onclick = function() {

    loginForm.style.visibility = "hidden";
    container.style.WebkitFilter = "blur(8px)";
    container.style.MozFilter = "blur(8px)";
    container.style.OFilter = "blur(8px)";
    container.style.filter = "blur(8px)";
    registerForm.style.visibility = "visible";


};


var funcCancel= function() {
     var a = document.getElementsByTagName("img");
    for (var i = 0; i< a.length;i++)
    {
        a[i].style.visibility = "hidden";
    }
    registerForm.style.visibility = "hidden";
    loginForm.style.visibility = "visible";

    container.style.WebkitFilter = "blur(0px)";
    container.style.MozFilter = "blur(0px)";
    container.style.OFilter = "blur(0px)";
    container.style.filter = "blur(0px)";
};
btnCancel.onclick = funcCancel;






//创建 xmlhttp对象接收数据

newUserID = document.getElementById("newUserID");
newName = document.getElementById("newName");
newUserPassword = document.getElementById("newUserPassword");
newUserPasswords = document.getElementById("newUserPasswords");
newMajorClass = document.getElementById("newMajorClass");
newDepartment = document.getElementById("newDepartment");
newType=document.getElementById("newType");
var isa ,isb ,isc, isd,ise; 
var xmlhttp;
var alertText = document.getElementById("alert");
if (window.XMLHttpRequest) { // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp = new XMLHttpRequest();
} else { // code for IE6, IE5
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}



//注册键 发送请求
var funcSend = function() {

	if (isa == true && isb == true && isc == true && isd == true && ise == true) {
    //回调函数，进入任务队列等待，返回查询结果，保存在responseText
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
			{
				if (xmlhttp.responseText == "true")
				{
					alert ("恭喜您注册成功");
					btnCancel.click();
					
				} 
				else

				{
					alert ("服务器开小差了，请稍后再试");

				}

			}
   
		}
		xmlhttp.open("GET", "register?reqtype=register&userID=" + newUserID.value + "&password=" + newUserPassword.value +
                         "&type=" + newType.value + "&name=" + newName.value +  "&majorClass=" + newMajorClass.value  +
    			"&department=" + newDepartment.value , true);
		xmlhttp.send();

	}

	else {
		alert("您填写的信息不完整");
	}

}




//判断学生的学号、邮箱是否存在
var funcDemand = function() {


    if (this.value== "") {
        return;
    }
    //发送请求
    
    var eleID = this.id;
    
    //回调函数，进入任务队列等待，返回查询结果，保存在responseText
    xmlhttp.onreadystatechange = function() 
    {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
        {
            if (xmlhttp.responseText == "false")
             {
                document.getElementById(eleID + "pic").style.visibility = "visible";
                document.getElementById(eleID + "pic").src = "img/ture.png";
                if (eleID == "newUserID")
                {
                    isa = true;
                }
                else {
                    ise = true;
                }
            } else if(xmlhttp.responseText == "true")
             {
                document.getElementById(eleID + "pic").style.visibility = "visible";
                document.getElementById(eleID + "pic").src = "img/flase.png";

            
                if (eleID == "newUserID") {
                alertText.innerHTML = "您输入的账号已经存在！";
                } 
             }

        }
    };
    
    xmlhttp.open("GET", "register?reqtype=checks&" + this.name + "=" + this.value, true);
    xmlhttp.send();
}


//清除文字

var funcClear = function() {
        
         if (this.id == "newUserName") {
            isb =false;
         };
         if (this.id == "newUserID") {
            isa =false;
         };

         if (this.id == "newUserPassword") {
            isc =false;
         };

         if (this.id == "newUserPasswords") {
            isd =false;
         };

         if (this.id == "newUserEmail") {
            ise =false;
         };


        this.value = "";
        alertText.innerHTML = "";
        document.getElementById(this.id + "pic").style.visibility = "hidden";
    }
    //判断密码是否一致

var funcPasswords = function() {
    var str1 = document.getElementById(this.id).value;
    if (str1 == "") {
        return;
    };
    if (newUserPassword.value == newUserPasswords.value) {
         document.getElementById(this.id + "pic").style.visibility = "visible";
        document.getElementById("newUserPasswordspic").src = "img/ture.png";
        isd =true;

    } else {
         document.getElementById(this.id + "pic").style.visibility = "visible";
        document.getElementById("newUserPasswordspic").src = "img/flase.png";
        alertText.innerHTML = "您两次输入的密码不一样！";

    }
}

var picConf = function() {
    var str = document.getElementById(this.id).value;
    if (str== "") {
        return;
    };
    if (this.id == "newUserName") {
        isb = true;
    }
    else
    {
      isc = true;
    }   
     document.getElementById(this.id + "pic").style.visibility = "visible";
    document.getElementById(this.id + "pic").src = "img/ture.png";
}



newUserID.onblur = funcDemand;
newUserName.onblur = picConf;
newUserPassword.onblur = picConf;
newUserPasswords.onblur = funcPasswords;
newUserEmail.onblur = funcDemand;

newUserID.onfocus = funcClear;
newUserName.onfocus = funcClear;
newUserPassword.onfocus = funcClear;
newUserPasswords.onfocus = funcClear;
newUserEmail.onfocus = funcClear;

btnRegisters.onclick = funcSend;







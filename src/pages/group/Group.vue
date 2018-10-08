<!--<template>
	<Item txt="小组"></Item>
</template>

<script>
	import Item from '../../components/both'
	export default{
		components:{
			Item
		}
	}
</script>

<style>
</style>-->
<template>
<div id="group">
    <!--小组-->
	<div class="group-xiaozu">
	   <p class="group-xiaozu-group">435529个小组等你来玩</p>
	   <p class="group-xiaozu-join">立即选择加入吧</p>
	   <p class="group-xiaozu-insting">根据你的兴趣推荐</p>
	</div>
	   <!--精品推荐-->
	<div class="group-tui">
	   <img src="../../assets/img/ic_rec_group_banner_6.png" alt="">
	</div>

     <!--影视-->
     <div class="group-center">
     	<div class="Movie-title">
     		<div class="Move-item"></div>
     		<div class="Move-title">影视</div>
     		<div class="Move-item"></div>
     	</div>
     	<ul class="group-Move">
     		<li>
     			<div><img src="../../assets/img/ic_group_check_anonymous.png" alt=""></div>
     			<div>378765人</div>
     			<div>
     				<p class="group-Move-title">推荐电影  (之谜电影)</p>
     				<span class="group-Move-lun">
     					加入豆瓣人数最多的影视组织，互相推荐和交流自认为好的电影，剧集。和动漫。。。。
     				</span>
     			</div>
     			<div><img class="move-img" src="../../assets/img/g_1.png" alt=""></div>
     			
     		</li>
     		<!--<li>
     			<div><img src="../../assets/img/ic_group_check_anonymous.png" alt=""></div>
     			<div>6060人</div>
     			<div>
     				<p class="group-Move-title">The Criterion Collection</p>
     				<span class="group-Move-lun">
     					Criterion Collection的出品是最传记最具有美感的DVD产品，如果你酷爱欧美亚，就是你值得拥有
     				</span>
     			</div>
     			<div><img class="move-img" src="../../assets/img/g_2.png" alt=""></div>
     			
     		</li>
     		<li>
     			<div><img src="../../assets/img/ic_group_check_anonymous.png" alt=""></div>
     			<div>6060人</div>
     			<div>
     				<p class="group-Move-title">老友记</p>
     				<span class="group-Move-lun">
     				喜欢FRIENDS申请进组时情意浓一句古老的话语，这样才会噶虐你有才华，适宜，如若不照片，局势不同韩国
     				</span>
     			</div>
     			<div><img class="move-img" src="../../assets/img/g_3.png" alt=""></div>
     			
     		</li>-->
     	</ul>
     </div>

</div>
</template>


<style>
*{
	list-style:none;
	text-decoration:none;
}
#group{
    position:absolute;
    top: -3%;
    left:0;
	width:100%;
	height:100px;
}
.group-xiaozu{
	position: relative;
	top:70px;	
	left:0;
	width: 100%;
	height: 180px;
	background: url(../../assets/img/ic_group_banner.png) no-repeat center;
	background-size: 100% 100%;
}
.group-xiaozu img{
	width: 100%;
	height: 100%;
}
.group-xiaozu>p{
   position: absolute;
   width: 100%;
   height: 30px;
   text-align: center;
 
}
.group-xiaozu-group{
	font-size: 23px;
	color: black;
	font-weight: 500;
	top: 15%;
}
.group-xiaozu-join{
	font-size: 15px;
	color: gray;
    top: 44%;
}
.group-xiaozu-insting{
	font-size: 12px;
	color: gray;
    top: 85%;
    left:-30%;
}
.group-tui{
	clear:both;
	position: absolute;
	text-align: center;
	top:255px;
	width: 100%;
	height: 90px;
}
.group-tui img{
	width: 90%;
	height: 90px;
}

/*影视*/
.group-center{
	clear: both;
	width: 100%;
	height: auto;
	text-align: center;
	margin-bottom: 40px;
	position: relative;
	left: 0%;
	top:183%;
}
.Movie-title{
	width: 100%;
	height: 30px;
	line-height: 30px;
	display: flex;
	flex-direction: row-reverse;
	justify-content: space-around;

}
.Move-item{
	width: 40%;
	height: 1px;
	border-bottom: solid 1px gray;
	text-align: center;
}
.Move-title{
	font-size: 18px;
	margin-top: -15px;
}
/*yingshi*/
.group-Move{
	width: 100%;
	height: auto;
	line-height: 100px;
	text-align: center;
	position: absolute;
	left: -10%;
}
.group-Move li{
	width: 90%;
	height: 80px;
	line-height: 100px;
	display: flex;
	flex-direction: row-reverse;
	justify-content: space-around;
	margin-left: 4%;
	margin-bottom: 10px;
}
.move-img{
	width: 70px;
	height: 70px;
}
/*.group-Move-title{
	font-size: 20px;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: normal;
}*/
.group-Move li div{
	display: inline-block;
	line-height: 20px;

}

.group-Move-title{
	display: block;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
	width: 90%;
	height: 20px;
	font-size: 17px;
}
.group-Move-lun{
	display: block;
	font-size: 13px;
	width:95%;
    height: 60px;
	word-break: break-all;
    text-overflow: ellipsis;
    display: -webkit-box; /** 将对象作为伸缩盒子模型显示 **/
    -webkit-box-orient: vertical; /** 设置或检索伸缩盒对象的子元素的排列方式 **/
    -webkit-line-clamp: 3; /** 显示的行数 **/
    overflow: hidden;  /** 隐藏超出的内容 **/
}
</style>

<template>
<div id="box">
		<div class="center">
			<h3>影院热播</h3>
		    <div class="duo">更多</div>
			<ul class="myul2">
				<li>
					<img src="../assets/img/p1.png">
					<p>悲伤逆流成河</p>
					<p>评分：8.0</p>
				</li>
				<li>
					<img src="../assets/img/p2.png">
					<p>大闹西游</p>
					<p>评分：7.5</p>
				</li>
				<li>
					<img src="../assets/img/p3.png">
					<p>黄金兄弟</p>
					<p>评分：7.0</p>
				</li>
				<li>
					<img src="../assets/img/p4.png">
					<p>反贪风暴3</p>
					<p>评分：7.2</p>
				</li>
				<li>
					<img src="../assets/img/p5.png">
					<p>江湖儿女</p>
					<p>评分：8.3</p>
				</li>
				<li>
					<img src="../assets/img/p6.png">
					<p>找到你</p>
					<p>评分：8.8</p>
				</li>
			</ul>
		<div class="to">
			<img src="../assets/img/01.jpg">
			<p>对话戏剧大师  列夫.朵金     3/05 17:00  要你看直播</p>
		</div>
	</div>
	
	<div id="foot">
		<h3>豆瓣热门</h3>
		<div class="rig"><span>全部500></span></div>
		<ul class="myul3">
				<li>
					<img src="../assets/img/1.jpg">
					<p>一出好戏</p>
					<p>评分：8.3</p>
				</li>
				<li>
					<img src="../assets/img/2.jpg">
					<p>碟中谍6</p>
					<p>评分：8.2</p>
				</li>
				<li>
					<img src="../assets/img/3.jpg">
					<p>怪兽</p>
					<p>评分：7.2</p>
				</li>
				<li>
					<img src="../assets/img/4.jpg">
					<p>快把我哥带走</p>
					<p>评分：8.1</p>
				</li>
				<li>
					<img src="../assets/img/5.jpg">
					<p>您的婚礼</p>
					<p>评分：7.0</p>
				</li>
				<li>
					<img src="../assets/img/6.jpg">
					<p>动物世界</p>
					<p>评分：8.1</p>
				</li>
			</ul>
	</div>

</div>
</template>

<script>
</script>

<style>
	.rig{
		position: absolute;
		right: 18%;
		top: 3.5%;
		color: #00FF7F;
	}
	.myul3{
		list-style: none;
		position: absolute;
		left: -38.5px;
		top: 39px;
	}
	.myul3 img{
		height: 140px;
		width: 105px;
	}
	.myul3 li{
		/*border: 1px solid red;*/
		height: 18%;
		width: 32.5%;
		float: left;
	}
	li p{
		margin-top: 0px;
		margin-bottom: 0px;
		font-size: 16px;
		font-family: 楷体;
	}
	
	
	.center{
		z-index: -2;
		/*border: 1px solid red;
		height: 50%;
		width: 100%;*/
		position: relative;
		top: 9px;
		left: -8px;
	}
	h3{
		position: absolute;
		left: 10%;
		top: 0%;
	}
	.duo{
		position: absolute;
		right: 16%;
		top: 20px;
		color: springgreen;
	}
	.myul2{
		list-style: none;
		position: absolute;
		left: -38.5px;
		top: 39px;
	}
	.myul2 img{
		height: 140px;
		width: 105px;
	}
	.myul2 li{
		/*border: 1px solid red;*/
		height: 18%;
		width: 32.5%;
		float: left;
	}
	li p{
		margin-top: 0px;
		margin-bottom: 0px;
		font-size: 16px;
		font-family: 楷体;
	}
	.to img{
		width: 104%;
		position: absolute;
		left: 0;
		top: 27.5rem;
	}
	.to p{
		position: absolute;
		left: 20px;
		top: 35.5rem;
	}
	#foot{
		/*border: 1px solid red;*/
		height: 74%;
		width: 99.5%;
		position: absolute;
		top: 43rem;
		left: 0;
		z-index: -2;
	}
</style>
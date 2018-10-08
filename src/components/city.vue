<template>
	<div id="box">
		
		<div id="city">
			<h3>热门活动</h3>
			<ul class="myCity">
				<li>
					<img src="../assets/img/c1.jpg"/>
					<p>韵.中法艺术</p>
				</li>
				<li>
					<img src="../assets/img/c2.jpg"/>
					<p>3D科幻舞台剧</p>
				</li>
				<li>
					<img src="../assets/img/c3.jpg"/>
					<p>鹿先森乐队</p>
				</li>
				<li>
					<img src="../assets/img/c4.jpg"/>
					<p>愿你所想</p>
				</li>
				<li>
					<img src="../assets/img/c5.jpg"/>
					<p>指挥蒂勒曼</p>
				</li>
				<li>
					<img src="../assets/img/c6.jpg"/>
					<p>广州秋季艺博会</p>
				</li>
			</ul>
		</div>
		<div class="cen">
			<img src="../assets/img/c7.jpg"/>
			<img src="../assets/img/c8.jpg"/>
		</div>
		<div id="pai">
			<h3>演唱会</h3>
			<ul class="yanUl">
				<li>
					<img src="../assets/img/c9.jpg" class="liImg1"/>
					<p class="li1">20218张韶涵'旅程'世界巡回演唱会-广州站<br />
					     10月27日 周六 19:30-21:30<br />
					     宝能国际体育演艺中心
					</p>
				</li>
				<li>
					<img src="../assets/img/c10.jpg" class="liImg2"/>
					<p class="li2">'不止，是李建'2018-2019世界巡回演唱会-广州站<br />
						11月17日  周六  19:30-21:30<br />
						宝能国际体育演艺中心
					</p>
				</li>
				<li>
					<img src="../assets/img/c11.jpg"  class="liImg3"/>
					<p class="li3">Nights with AGA演唱会巡演2018-广州站<br />
						12月8日  周六  19:30-21:30<br />
						广州体育馆2号馆
					</p>
				</li>
			</ul>
		</div>
		
	</div>
</template>

<script>
</script>

<style>
	#city{
		/*border: 1px solid red;*/
		height: 50%;
		width: 98%;
		position: absolute;
		top: 10%;
		left: 0%;
		z-index: -2;
	}
	.myCity{
		position: absolute;
		top: 13%;
		left: 0%;
		padding-left: 1%;
	}
	.myCity>li{
		list-style: none;
		float: left;
		margin-left: 3%;
	}
	.myCity>li>img{
		height: 140px;
    	width: 105px;
	}
	.cen{
		position: absolute;
		top: 70%;
		left: 5%;
		z-index: -2;
	}
	.cen>img{
		width: 170px;
		height: 151px;
	}
	#pai{
		position: absolute;
		top: 92%;
		left: 0%;
		/*border: 1px solid red;*/
		height: 82%;
		width: 98%;
		z-index: -2;
	}
	.yanUl>li{
		list-style: none;
	}
	.liImg1{
		position: absolute;
		left: 5%;
		top: 12%;
	}
	.li1{
		position: absolute;
		top: 16%;
		left: 35%;
	}
	.liImg2{
		position: absolute;
		left: 5%;
		top: 36%;
	}
	.li2{
		position: absolute;
		top: 40%;
		left: 33%;
	}
	.liImg3{
		position: absolute;
		left: 5%;
		top: 59%;
	}
	.li3{
		position: absolute;
		top: 63%;
		left: 34%;
	}
</style>


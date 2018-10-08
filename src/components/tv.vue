<template>
	<div id="box">
		
		<div id="tv">
			<img src="../assets/img/ic_rec_group_banner_6.png" class="timg"/>
			<h3 class="jie">热门电视剧</h3>
			<ul id="more">
				<li>热门</li>
				<li>美剧</li>
				<li>英剧</li>
				<li>韩剧</li>
				<li>日剧</li>
				<li>国产剧</li>
			</ul>
			<ul id="myTv">
				<li>
					<img src="../assets/img/t1.jpg"/>
					<p>如懿传   8.0</p>
				</li>
				<li>
					<img src="../assets/img/t2.jpg"/>
					<p>延禧宫略   7.9</p>
				</li>
				<li>
					<img src="../assets/img/t3.jpg"/>
					<p>天盛长歌   7.5</p>
				</li>
				<li>
					<img src="../assets/img/t4.jpg"/>
					<p>香蜜沉沉   8.0</p>
				</li>
				<li>
					<img src="../assets/img/t5.jpg"/>
					<p>橙红年代   8.0</p>
				</li>
				<li>
					<img src="../assets/img/t6.jpg"/>
					<p>斗破苍穹   7.4</p>
				</li>
			</ul>
		</div>
		<div id="xin">
			<img src="../assets/img/t9.jpg"/>
		</div>
		<div id="bang">
			<h3>豆瓣榜首</h3>
			<ul  class="lie">
				<li>
					<img src="../assets/img/t7.jpg" class="jieImg1"/>
					<p class="jieFont1">
						1.请吃红小豆吧！  9.1分<br />
						2.天盛长歌  8.0分<br />
						3.夜天子   7.6分
					</p>
				</li>
				<li>
					<img src="../assets/img/t8.jpg" class="jieImg2"/>
					<p class="jieFont2">
						1.无耻之徒(美版)第九季<br />
						2.马男波杰克  第五季<br />
						3.美国恐怖故事   8.6分
					</p>
				</li>
			</ul>
		</div>
	</div>
</template>

<script>
</script>

<style>
	#tv{
		/*border: 1px solid red;*/
		height: 90%;
		width: 100%;
		z-index: -2;
	}
	.timg{
		position: absolute;
		top: 11%;
		left: 1%;
		width: 98%;
		z-index: -2;
	}
	.jie{
		position: absolute;
		top: 12%;
		left: 7%;
		z-index: -2;
	}
	#more{
		/*border: 1px solid red;*/
		height: 30px;
		width: 87%;
		position: absolute;
		top: 20%;
		left: 0%;
		z-index: -2;
	}
	#more>li{
		list-style: none;
		float: left;
		margin: 2%;
		background: #ccc;
		color: ghostwhite;
		padding: 1%;
		margin-left: 1%;
		margin-top: 1%;
	}
	#more>li:hover{
		color: #27a;
	}	
	#myTv{
		position: absolute;
		top: 26%;
		left: -8%;
		z-index: -2;
	}
	#myTv li{
		list-style: none;
		float: left;
		margin-left: 3%;
	}
	#myTv img{
		height: 140px;
   		width: 105px;
	}
	#bang{
		position: absolute;
		top: 99%;
		left: 2%;
		/*border: 1px solid red;*/
		height: 55%;
		width: 96%;
		z-index: -2;
	}
	.lie>li{
		list-style: none;
	}
	.lie>li>img{
		width: 120px;
		height: 120px;
	}
	.jieImg1{
		position: absolute;
		left: 3%;
		top: 14%;
	}
	.jieFont1{
		position: absolute;
		top: 23%;
		left: 43%;
	}
	.jieImg2{
		position: absolute;
		left: 3%;
		top: 48%;
	}
	.jieFont2{
		position: absolute;
		top: 55%;
		left: 43%;
	}
	#xin{
		position: absolute;
		top: 82%;
		left: 0;
	}
	#xin img{
		width: 98%;
	}
</style>
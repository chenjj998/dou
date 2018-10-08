<template>
	<div id="box">
		<div id="cen">
			<div class="read">
				<img src="../assets/img/ic_rec_group_banner_1.png" class="tit"/>
				<h3 class="title">最受关注<a href="#">更多》</a></h3>
				<div class="A">
					<img src="../assets/img/r7.jpg"/>
					<div id="rig">
						<p class="tian">天长地久</p>
						<p class="imgs">
							<img src="../assets/img/rating_star_card_on.png"/>
							<img src="../assets/img/rating_star_card_on.png"/>
							<img src="../assets/img/rating_star_card_on.png"/>
							<img src="../assets/img/rating_star_card_on.png"/>
						    <img src="../assets/img/rating_star_card_on.png"/>
					    </p>
					    <p class="auter">作者  龙应台<br>亲情/散文</p>
					    <p class="wei">把母亲当做朋友，趁现在还有时间。(哲空空评论)</p>
					</div>
				</div>
			</div>
		    <div id="fast">
		    	<h3 id="tit">新书快递</h3>
		    	<ul id="mybook">
		    		<li>
		    			<img src="../assets/img/r1.jpg"/>
		    			<p class="fColo">星空</p>
		    			<p>[英]尼尔.盖曼</p>
		    		</li>
		    		<li>
		    			<img src="../assets/img/r2.jpg"/>
		    			<p class="fColo">无所谓</p>
		    			<p>冯唐</p>
		    		</li>
		    		<li>
		    			<img src="../assets/img/r3.jpg"/>
		    			<p class="fColo">什么都能拿来画</p>
		    			<p>罗罗布</p>
		    		</li>
		    		<li>
		    			<img src="../assets/img/r4.jpg"/>
		    			<p class="fColo">ab珊瑚</p>
		    			<p>[日]黑田夏子</p>
		    		</li>
		    		<li>
		    			<img src="../assets/img/r5.jpg"/>
		    			<p class="fColo">阴剑秋风抄</p>
		    			<p>[日]藤泽周平</p>
		    		</li>
		    		<li>
		    			<img src="../assets/img/r6.jpg"/>
		    			<p class="fColo">云是黑色的</p>
		    			<p>刘梓洁</p>
		    		</li>
		    	</ul>
		    </div>
			<div id="footer">
				<h3 class="xian">最受欢迎的书评</h3>
				<ul id="myping">
					<li>
						<img src="../assets/img/r8.jpg"/>
						<span class="a">信息洪流中，我们该如何培养独立思考的能力？</span><br />
						<span class="b">南玉书 评论 《如何有效阅读一本书》</span>
						<p class="content">大家也许都听说过“王戎识李”的故事。 这个故事是说古代有个聪明的小孩叫王戎，在他七岁的时候，
							跟小伙伴们一起出去玩，碰巧看到路旁有一棵李树结满了果子。于是......</p>
					</li>
				</ul>
			</div>
		</div>
	</div>
</template>

<script>
</script>

<style>
	#footer{
		/*border: 1px solid red;*/
		height: 46%;
		width: 98%;
		position: absolute;
		top: 107%;
		left: 0;
	}
	#myping>li{
		list-style: none;
		height: 34%;
		width: 100%;
		position: absolute;
		top: 20%;
		left: 0;
		font-family: 楷体;
	}
	#myping>li>img{
		position: absolute;
		left: 2%;
	}
	.a{
		font-size: 16px;
		margin-left: 29%;
	}
	.b{
		margin-left: 31%;
		font-size: 14px;
		color: #00FF7F;
	}
	.content{
		margin-left: 29%;
		margin-top: 4%;
	}
	
	.tit{
		position: absolute;
		top: -41%;
		left: 2%;
		width: 102%;
	}
	.title{
		position: absolute;
		top: -36%;
		left: 8%;
		width: 39%;
		height: 10%;
	}
	.title a{
		font-size: 16px;
		text-decoration: none;
		margin-left: 4%;
		font-family: 楷体;
	}
	.read{
		position: absolute;
		top: 22%;
		left: 0;
		z-index: -2;
	}
	.A>img{
		position: absolute;
		left: 3%;
		top: 0%;
	}
	.tian{
		margin-top: 2%;
		margin-left: 12%;
	}
	.imgs{
		margin-left: 12%;
		margin-top: 0%;
	}
	.imgs>img{
		width: 25px;
		height: 25px;
	}
	.auter{
		margin-left: 11%;
		font-family: 楷体;
	}
	.wei{
		margin-left: 8px;
		margin-top: 7%;
		font-family: 楷体;
	}
	#fast{
		/*border: 1px solid red;*/
		height: 73%;
		width: 98%;
		position: absolute;
		top: 46%;
		left: 0;
		z-index: -2;
	}
	#mybook>li{
		list-style: none;
	}
	#mybook{
		list-style: none;
		position: absolute;
		left: -38.5px;
		top: 39px;
	}
	#mybook img{
		height: 140px;
		width: 105px;
	}
	#mybook li{
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
	.fColo{
		color: cyan;
	}
</style>
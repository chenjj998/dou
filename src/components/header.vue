<template>
	<div class="heads">
		<div class="img1">
			<img src="../assets/img/ic_search_gray.png" alt="Err"/>
		</div>
		<input type="text" id="inp" value="" placeholder="请输入你要查询的文字"/>
		<div class="img2">
			<img src="../assets/img/ic_scan_gray.png" alt="Err"/>
		</div>
		<div class="img3">
			<img src="../assets/img/ic_chat_white.png" alt="Err"/>
		</div>
	</div>
	
</template>

<script>
	export default{
		props:['img1','txt1','img2','img3']
	}
</script>

<style>
	.heads{
		/*border: 1px solid red;*/
		height: 52px;
		width: 100%;
		position: absolute;
		top: 0;
		left: 0;
		background: #68CB78;
	}
	#inp{
		height: 30px;
		width: 70%;
		margin-top: 5px;
		margin-left: -50px;
		padding-left: 55px;
		border-radius: 20px;
	}
	.img1{
		position: absolute;
		left: 5%;
		top: 19%;
	}
	.img1 img{
		height: 30px;
		width: 30px;
	}
	.img2 img{
		position: absolute;
		top: 23%;
		left: 70%;
	}
	.img2 img{
		height: 30px;
		width: 30px;
	}
	.img3 img{
		position: absolute;
		right: 4%;
		top: 15%;
	}
	.img3 img{
		height: 35px;
		width: 35px;
	}
</style>
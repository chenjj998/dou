<template>
	<div class="headWri">
		<h4>{{txt}}</h4>
	    <img src="../assets/img/ic_actionbar_search_icon.png" alt="err" class="showImg1"/>
	    <img src="../assets/img/ic_chat_green.png" alt="err" class="showImg2"/>
	</div>
</template>
<script>
	export default{
		props:['txt']
	}
</script>
<style>
	.headWri{
		/*border: 1px solid red;*/
		height: 40px;
		width: 100%;
		position: fixed;
		top: 0;
		left: 0;	
		background-color: white;	
	}
	h4{
		text-align: center;
		margin-top: 1.0rem
	}
	.showImg1{
		height: 2rem;
   		width: 2rem;
   		position: absolute;
   		top: 0.4rem;
   		right: 6rem;
	}
	.showImg2{
		height: 2rem;
   		width: 2rem;
   		position: absolute;
   		top: 0.4rem;
   		right: 2rem;
	}
</style>

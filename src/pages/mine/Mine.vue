<template>
<div>
	 <div class="mine-header">
    	<p class="mine-shezhi">
    		<img src="../../assets/img/ic_tab_group_normal.png" alt=""/>
    	</p>
    	<div class="mine-info">
    		<div class="mine-login">
    			<p>
    				<span class="mine-name">豆友6666</span>
    				<span class="mine-zhu">个人主页</span>
    			</p>
    			<p>
    				<span class="mine-guan">关注 3</span>
    				<span class="mine-noguan">被关注 0</span>
    			</p>
    		</div>
    		<div class="mine-user">
    			<img src="../../assets/img/ic_share_default_user.png"/>
    		</div>
    		
    	</div>
    </div>
    
     <!--我的书影音-->
    <div class="shuyingyin">
    	<p class="shuyingyin-tit">我的书影音</p>
    	<div class="style">
    		<div>
		    	<img src="../../assets/img/ic_my_music.png"/>
		    	<p>音乐</p>
		    </div>
		    <div>
			    <img src="../../assets/img/ic_my_books.png"/>
	    		<p>读书</p>
    	   </div>
            <div>
    			<img src="../../assets/img/ic_my_movies_tvs.png"/>
    		    <p>影视.综艺</p>
    	    </div>

    	</div>
    </div>
    
    	<p class="one1"></p>
    <ul class="mine-list">
		<li >
			<div>
				<img class="mine-list-img" src="../../assets/img/abc_list_focused_holo.9.png"> 
				 <span class="mine-list-item">看电影</span>
			 </div>
			<div>
			 <span class="mine-list-fu">></span>
			</div>
		</li>
		<li>
			<div>
				<img class="mine-list-img" src="../../assets/img/topic_guangbo_edit.png"> 
			<span class="mine-list-item">我的发布</span>
	       
			</div>
			<div>
				<span class="mine-list-fu">></span>
			</div>
		</li>
		<li>
			<div>
				<img class="mine-list-img" src="../../assets/img/ic_groups_more.png">
			<span class="mine-list-item">我的日记</span>
	       
			</div>
			<div>
				<span class="mine-list-fu">></span>
			</div>
		</li>
		<li>
			<div>
				<img class="mine-list-img" src="../../assets/img/ic_seti_create.png">
				<span class="mine-list-item">我的关注</span>
			</div>
			<div>
				<span class="mine-list-fu">></span>
			</div>
	    </li>
		<li>
	     <div>
	     	<img class="mine-list-img" src="../../assets/img/ic_tab_subject_active.png">
	     		<span class="mine-list-item">相册</span>
	     </div>
	     <div>
	     	<span class="mine-list-fu">></span>
	     </div>
		 </li>
		
		<li>
			<div>
				<img class="mine-list-img" src="../../assets/img/ic_my_doulist.png">
				<span class="mine-list-item">豆列 / 收藏</span>
			</div>
			<div>
				<span class="mine-list-fu">></span>
			</div>
	
		 </li>
		<li>
			<div>
				<img src="../../assets/img/topic_guangbo_edit.png" class="mine-list-img" />
				<span class="mine-list-item">钱包</span>
			</div>
			<div>
				<span class="mine-list-fu">></span>
			</div>
		</li>
			<p class="one2"></p>
</ul>
    
</div>
</template>

<script>
</script>

<style>
	*{
		list-style: none;
	}
	.mine-header{
		position: absolute;
		top:0;
		left: 0%;
		width: 100%;
		height: 200px;
		background: #52C061;
	}	
	.mine-shezhi{
		position: relative;
		top:2%;
		height: 30px;
		line-height: 30px;
		text-align: right;
		padding-right: 20px;
	
	}
	.mine-shezhi img{
		width: 50px;
		height: 50px;
	}
	.mine-user img{
		width: 100px;
		height: 100px;
	    position: absolute;
	    left: 3%;
	    top: -7%;
	}
	.mine-info{
		position: absolute;
		top:60px;
		left: 0;
		color: #FFF5F7;
		width: 100%;
		height: 140px;
	}
	.shuyingyin{
		position: absolute;
		left: 0px;
		top:200px;
		width: 100%;
		height: 120px;
		
	}
	.shuyingyin-tit{
		font-size: 18px;
		margin-left: -63%;
	}
	.style{
		display: flex;
		flex-direction: row-reverse;
		justify-content: space-around;	
	}
	.shuyingyin .style img{
		width: 40px;
		height: 40px;
	}
	.shuyingyin .style P{
		margin-top: 2%;
		color: darkgray;
	}
	
	.one1{
		width: 100%;
		height: 8px;
		background: #F2F1EF;
		position: absolute;
		top: 27.5%;
		left: 0;
	}
	.mine-list{
		/*border: 1px solid red;*/
		width: 88.5%;
		height:58%;
		position: absolute;
		left: 0%;
		top:51%;
		
	}
	.mine-list img{
		width: 20px;
		height: 20px;
		position: absolute;
		left: 15%;
		margin-top: 3%;
	}
	.mine-list li{
		margin-left: -5%;
		width: 105%;
		height:40px;
		line-height: 40px;
		border-bottom: solid 1.5px #F2F1EF;
		/*border: 1px solid blue;*/
	}
	.mine-list-fu{
		position: absolute;
		right: 5%;
		line-height: 40px;
		margin-top: -11%;
		color: gray;
	}
	.mine-list-item{
		font-size: 15px;
		margin-left: -40%;
	}
	.one2{
		width: 100%;
		height: 8px;
		background: #F2F1EF;
		position: absolute;
		top: -6.5%;
		left: 0;
	}

</style>
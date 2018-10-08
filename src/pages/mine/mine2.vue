<template>
<div>
    <div class="mine-header">
    	<p class="mine-shezhi">
    		<img src="../../assets/img/ic_tab_group_normal.png" alt=""/>
    	</p>
    	<div class="mine-info">
    		<div class="mine-login">
    			<p>
    				<span class="mine-name">豆友185371391</span>
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

 <!--列表-->

<ul class="mine-list">
	<p class="one"></p>
	<li >
		<div>
			<img class="mine-list-img" src="../../assets/img/abc_list_focused_holo.9.png"> 
			 <span class="mine-list-item">看电影</span>
		 </div>
		<div>
		 <span class="mine-list-fu">></span>
		</div>
	</li>
	<p class="one"></p>
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
	 	<p class="one"></p>
	<li>
		<div>
			<img src="../../assets/img/topic_guangbo_edit.png" class="mine-list-img" />
			<span class="mine-list-item">钱包</span>
		</div>
		<div>
			<span class="mine-list-fu">></span>
		</div>
	</li>
		<p class="one"></p>
</ul>


</div>
</template>
<style>
	.mine-header{
		position: absolute;
		top:10;
		left: 0;
		width: 100%;
		height: 200px;
		background: #52C061;
	}	
	.mine-shezhi{
		position: relative;
		top:20px;
		height: 30px;
		line-height: 30px;
		text-align: right;
		padding-right: 20px;
	
	}
	.mine-shezhi img{
		width: 25px;
		height: 25px;
	}
	.mine-info{
		position: absolute;
		top:60px;
		left: 0;
		color: #FFF5F7;
		width: 100%;
		height: 140px;
		display: flex;
		flex-direction: row-reverse;
		justify-content: space-around;
	}
	.mine-info div{
		display: inline-block;
	}
	.mine-user{
		width: 20%;
		height: 70px;
		text-align: right;
	}
	.mine-login{
		width: 75%;
		height: 60px;
		line-height:23px;
		border-bottom: solid 0.5px #FFF5F7; 
		
	}
	.mine-user img{
		width: 60px;
		height: 60px;
	}
	.mine-name{
		font-size: 16px;
	}
	.mine-zhu,.mine-guan,.mine-noguan{
		font-size: 12px;
	}
	.mine-zhu{
		margin-left: 130px;
	}
	.shuyingyin{
		position: absolute;
		left: 0px;
		top:200px;
		width: 100%;
		height: 120px;
		
	}
	.shuyingyin-tit{
		font-size: 15px;
		padding-left: 20px;
		line-height: 40px;
	}
	.style{
		display: flex;
		flex-direction: row-reverse;
		justify-content: space-around;	
	}
	.shuyingyin .style div{
	width: 30%;
	height: 100px;
	text-align: center;
	}
	.mine-list{
		position: absolute;
		left: 0px;
		top:340px;
		width: 100%;
		height:400px;
		
	}
	.mine-list img{
		width: 20px;
		height: 20px;
		padding-left: 30px;
	
	}
	.mine-list li{
		width: 100%;
		height:40px;
		line-height: 40px;
		border-bottom: solid 1px #F2F1EF;
		
	}
	.mine-list li div{
		display: inline-block;
	}
	.mine-list-fu{
		position: absolute;
		right: 15px;
		line-height: 40px;
		margin-top: -25px;
		color: gray;
	}
	.mine-list-item{
		font-size: 13px;
		margin-left: 10px;
		line-height: 40px;
	}
	.one{
		width: 100%;
		height: 5px;
		background: #F2F1EF;
	}
</style>
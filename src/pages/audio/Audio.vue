<template>
	<div>
		<Item txt="书影音"></Item>
		<div id="box">
			<ul class="myul">
				<li><router-link to="/Audio/film">电影</router-link></li>
				<li><router-link to="/Audio/read">读书</router-link></li>
				<li><router-link to="/Audio/tv">电视</router-link></li>
				<li><router-link to="/Audio/city">同城</router-link></li>
				<li><router-link to="/Audio/music">音乐</router-link></li>
			</ul>
			<router-view></router-view>
		</div>
		<div id="cont">
            <ul>
            	<li v-for="item in arr">{{item.id}}</li>
            </ul>
		</div>
	</div>
</template>

<script>
	import Item from '../../components/both'
	export default{
		components:{
			Item
		},
		data:function(){
			return{
				url:'',
				arr:[]
			}
		},
		methods:{
			selects(){
				this.axios.get("http://localhost:8080/douban/servlet/NewServlet").then(
				val=>{this.arr=val.data;console.log(val.data);});
			}
		},
		created(){
			this.selects();
		}	
	}
</script>

<style>
.myul{
	/*border: 1px solid red;*/
	height: 35px;
	width: 104%;
	position: fixed;
	left: -50px;
	top: 3.5%;
	background-color: white;
}
.myul li{
	list-style:none;
	float:left;
	/*border: 1px solid blue;*/
	height: 19px;
	width: 16.75%;
	padding: 5px;
	margin-top: 6px;
}
.myul li:hover{
	border-bottom: 2px solid #68CB78;
	color: #68CB78;
}
</style>
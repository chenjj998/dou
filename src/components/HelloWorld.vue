<template>
  <div class="app">
    <Item txt="首页" mark=1 @change="getVal" :sel="selected" route="/home">
      <img slot="showImg" src="../assets/img/1.png"/>
      <img slot="hideImg" src="../assets/img/2.png"/>
    </Item>
    <Item txt="书影音" mark=2 @change="getVal" :sel="selected" route="/audio">
      <img slot="showImg" src="../assets/img/3.png"/>
      <img slot="hideImg" src="../assets/img/4.png"/>
    </Item>
    <Item txt="广播" mark=3 @change="getVal" :sel="selected" route="/broadcast">
     <img slot="showImg" src="../assets/img/5.png"/>
      <img slot="hideImg" src="../assets/img/6.png"/>
    </Item>
    <Item txt="小组" mark=4 @change="getVal" :sel="selected" route="/group">
      <img slot="showImg" src="../assets/img/7.png"/>
      <img slot="hideImg" src="../assets/img/8.png"/>
    </Item>
    <Item txt="我的" mark=5 @change="getVal" :sel="selected" route="/mine">
      <img slot="showImg" src="../assets/img/9.png"/>
      <img slot="hideImg" src="../assets/img/10.png"/>
    </Item>
  </div>
</template>


<script type="text/javascript">
	
   import Item from './tabbar.vue'
   
   export default{
      components:{
         Item
      },
      data:function(){
        return{
           selected:"1"
        }
      },
      methods:{
        getVal:function(val){
            this.selected=val;
        }
      }
   }
</script>


<style>
  .app{
    border-top:1px solid gray;
    width: 100%;
    height: 65px;
    position: fixed;
    bottom:0;
    left:0;
    background-color: gainsboro;
  }
  .child{
    float:left;
    width:20%;
    font-family: 楷体;
    font-size: 16px;
  }
  .child img{
  	width: 45px;
  }
</style>
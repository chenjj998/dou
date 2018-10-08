<template>
	<div class="child" @click="catchs">
	  <span v-show="bol"><slot name="showImg"></slot></span>
	  <span v-show="!bol"><slot name="hideImg"></slot></span><br/>
	  <span v-bind:class="{bolStyle:!bol}">{{txt}}</span>
	</div>
</template>

<script>
  export default{
   	props:['txt','mark','sel','route'],
    computed:{
    bol:function(){
      if(this.mark==this.sel){
 		   this.$router.push(this.route);
 		   return false;
         }else{
           return true;
         }
      }  
    },
    methods:{
      catchs:function(){
         this.$emit("change",this.mark);
      }
    }
  } 
</script>

<style>
  .bolStyle{
    color:#42bd56;
  }
</style>

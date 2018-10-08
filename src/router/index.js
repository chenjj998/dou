import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld.vue'
import Home from '../pages/home/Home.vue'
import Audio from '../pages/audio/Audio.vue'
import Broadcast from '../pages/broadcast/Broadcast.vue'
import Group from '../pages/group/Group.vue'
import Mine from '../pages/mine/Mine.vue'
import header from '../components/header.vue'
import both from '../components/both.vue'
import film from '../components/film.vue'
import read from '../components/read.vue'
import tv from '../components/tv.vue'
import city from '../components/city.vue'
import music from '../components/music.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },{
    	path: '/home',
      name: 'Home',
      component: Home
    },{
    	path: '/audio',
      name: 'Audio',
      component: Audio,
      children:[
      	{path:'',component:film},
      	{path:'film',component:film},
      	{path:'read',component:read},
      	{path:'tv',component:tv},
      	{path:'city',component:city},
      	{path:'music',component:music}
      ]
    },{
    	path: '/broadcast',
      name: 'Broadcast',
      component: Broadcast
    },{
    	path: '/group',
      name: 'Group',
      component: Group
    },{
    	path: '/mine',
      name: 'Mine',
      component: Mine
    }
  ]
})

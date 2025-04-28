import { createRouter, createWebHistory,isNavigationFailure} from 'vue-router';

import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
import NotFound from '@/pages/NotFound.vue';
const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', name: 'home', component: Home },
    { path: '/about', name: 'about', component: About },
    { path: '/members', name: 'members', component: Members },
    {
      path: '/members/:id',
      name: 'members/id',
      component: MemberInfo,
      beforeEnter: membersIdGuard,
    },
    {
      path: '/videos',
      path: '/videos', name:'videos', component: Videos,
      component: Videos,
      children: [{ path: ':id', name: 'videos/id', component: VideoPlayer }],
    },
    { path: '/:paths(.*)*', name: 'NotFound', component: NotFound },
    
      path: '/members/:id', name:'members/id', component: MemberInfo,
      beforeEnter:membersIdGuard
      },
  ],
  const membersIdGuard = ((to, from) => {
    // members/:id 경로는 반드시 이전 경로가
    // /members, /members:id 인 경우만 내비게이션 허용함
    if (from.name !== "members" && from.name !== "members/id") {
    return false;
    }
    
export default router;

})

})

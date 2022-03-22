import {createRouter, createWebHistory} from 'vue-router'
import Layout from '../layout/Layout'

const routes = [
    {
        path: '/',
        name: 'Layout',
        component: Layout,
        redirect: "/blog",
        children: [
            {
                path: 'blog',
                name: 'Blog',
                component: () => import("@/views/Blog")
            },
            {
                path: 'category',
                name: 'Category',
                component: () => import("@/views/Category")
            },
            {
                path: 'tag',
                name: 'Tag',
                component: () => import("@/views/Tag")
            }
        ]
    },
    {
        path: '/about',
        name: 'about',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router

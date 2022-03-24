import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as ELIcons from '@element-plus/icons-vue'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

const app = createApp(App);
app.use(store).use(router).use(ElementPlus, {
    locale: zhCn,
})
for(const iconName in ELIcons){
    app.component(iconName,ELIcons[iconName])
}
app.mount('#app')

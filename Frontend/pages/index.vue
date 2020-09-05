<template>

  <div class="root">
    <v-layout class="info2">
      <v-btn x-large color="#09ABCA" dark>สร้างรายการสั่งซื้อสินค้า</v-btn>
    </v-layout>
    <v-layout class="info1">
      <v-img :src="require('../photo/page1.png')"></v-img>
    </v-layout>
  </div>

</template>

<script>
import Logo from '~/components/Logo.vue'
import VuetifyLogo from '~/components/VuetifyLogo.vue'

export default {
  components: {
    Logo,
    VuetifyLogo
  }
}
</script>
<style>
  .root{
    align-items: center;
    padding-top: 40px;
    background: #919191;
    background-repeat: no-repeat;
    background-size: cover;
    height: 100%;
  }
 
  .info1{
    padding-right: 90px;
    float: right;
    width: 700px;
  }
  .info2{
    padding-top: 45px;
  }
</style>

<template>
  <v-layout>
    <div class="flex-container">
      <div class="diagram1">

      </div>
      <div class="diagram2">
        <v-combobox
          class="combx1"
          v-model="CompanySelect"
          :items="CompanyOrder"
          item-text="name"
          item-value="id_com"
          label="เลือกบริษัท"
          outlined
          solo
        >
        </v-combobox>
        <v-card>
    <v-card-title>
      Nutrition
      <v-spacer></v-spacer>
      <v-text-field
        v-model="search"
        append-icon="mdi-magnify"
        label="Search"
        single-line
        hide-details
      ></v-text-field>
    </v-card-title>
    <v-data-table
          :search="search"
          v-model="selected"
          :headers="headers"
          :items="pro"
          :single-select="singleSelect"
          item-key="id_product"
          show-select
          class="elevation-1"
    ></v-data-table>
  </v-card>
       
        
      </div>
      <div class="diagram3">
        <v-img :src="require('../photo/page2.png')"></v-img>
      </div>
</div>
  </v-layout>
</template>
<style>
h1{
  padding-top: 90px;
}
</style>

<script>
import http from "../http-common";
export default {
  data: () => {
   return{
    search: null,
    singleSelect: false,
    order: [],
    pro: [],
    CompanySelect: null,
    CompanyOrder: [],
    headers: [
          {
            text: 'รหัสสินค้า',
            align: 'start',
            sortable: false,
            value: 'code_product',
          },
          { text: 'ชื่อสินค้า', value: 'name_product' },
    ]
   };
  },
  methods: {
    /* eslint-disable no-console */
    getOrderdetail() {
      http
      .get("/orderdetail")
      .then(response => {
        this.order = response.data;
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
    },
    getAddress(){
      http
      .get("/campanyOrder")
      .then(response => {
        this.CompanyOrder = response.data;
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
    },
    getProduct(){
      http
      .get("/product")
      .then(response => {
        this.pro = response.data;
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
    },
    refreshList() {
      this.getOrderdetail();
      this.getProduct();
      this.getAddress();
    }
    /* eslint-enable no-console */
},
  mounted() {
      this.getOrderdetail();
      this.getProduct();
      this.getAddress();
  },
};
</script>

<style>
  .combx{
    padding-top: 150px;
  }
  .combx1{
    width: 565px;
  }
  .flex-container {
  display: flex;
  width: 100%;

  background-color: #FF7101;
  }
  .diagram1{
    padding-left: 25%;
  }
  .diagram2{
    padding-top: 150px;
  }
  .diagram3{
    padding-top: 200px;
    padding-right: 25%;
  }
  .text1{
    width: 450px;
  }
  .bt1{
    padding-left: 340px;
  }

</style>
<script setup>
import axios from 'axios'

const listUrl = '/api/todos'
const todoUrlPrefix = '/api/todos/'
//전체 목록을 조회한 후 한 건 씩 순차적으로 조회하기
const requestAPI = async () => {
  let todoList

  let response = await axios.get(listUrl)
  todoList = response.data
  console.log('# TodoList : ', todoList)
  for (let i = 0; i < todoList.length; i++) {
    response = await (todoUrlPrefix + todoList[i].id)
    console.log(`# $(i+1)번째 Todo : `, response.data)
  }
}
requestAPI()
</script>

<template>
  <div class="App2"></div>
</template>

<style scoped></style>

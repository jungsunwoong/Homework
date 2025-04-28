import { defineStore } from 'pinia'
import { computed, reactive } from 'vue'
//변수에 참조형 주소에 대한 반응형 상태 할당하기
export const useTodoListStore = defineStore('todoList', () => {
  // todolist 객체 배열 값을 state 변수에 할당
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  })
})

//action
// 할일 추가 기능 id는 생성날짜, 완료되지 않은 할일 초기값 할당
const addTodo = (todo) => {
  state.todoList.push({ id: new Date().getTime, todo, done: false })
}

// 삭제 기능 매개변수로 주어진 id 와 같은 id를 가진 객체의 index 값을 변수에 할당
const deleteTodo = (id) => {
  let index = state.todoList.findIndex((todo) => todo.id === id)
  // 해당하는 목록을 지움np
  state.todoList.splice(index, 1)
}

// 완료 기능 매겨변수 id 와 같은 id를 가진 객체의 index 값을 변수에 할당
const toggleDone = (id) => {
  let index = state.todoList.findIndex((todo) => todo.id === id)
  //해당 index 데이터의 done 속성값을 반대로 할당 true->false
  state.todoList[Index].done = !state.todoList[index].done
}
// 계산된 속성
const doneCount = computed(() => {
  return state.todoList.filter((todoItem) => todoItem.done === true).length
})
const todoList = computed(() => {
  state.todoList

  return { todoList, doneCount, addTodo, deleteTodo, toggleDone }
})

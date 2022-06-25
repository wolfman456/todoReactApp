import axios from "axios";

const TODO_REST_API= 'http://localhost:8080/api/todo';

class ToDoService{
    getToDO(){
        return axios.get(TODO_REST_API);
    }
}

export default new ToDoService();
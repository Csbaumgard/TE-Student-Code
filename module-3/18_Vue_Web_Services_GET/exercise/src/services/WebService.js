import axios from 'axios';

export default {
    getTopics() {
        return axios.get('/topics')
    },
    getTopicById(id) {
        return axios.get('/topics/' + id);
    }
}


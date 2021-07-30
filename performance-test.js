import { sleep } from 'k6';
import http from 'k6/http';

export let options = {
  duration: '1m',
  vus: 50,
};

export default function () {
  http.get('http://172.16.16.151:8080/employee');
  sleep(3);
}

import { sleep } from 'k6';
import http from 'k6/http';
import { htmlReport } from "https://raw.githubusercontent.com/benc-uk/k6-reporter/main/dist/bundle.js";

export let options = {
  duration: '1m',
  vus: 50,
  jsonFile: ".",
  output: ".",
};

export default function () {
  http.get('http://172.16.16.151:8080/employee');
  sleep(3);
}

export function handleSummary(data) {
  return {
    "summary.html": htmlReport(data),
  };
}
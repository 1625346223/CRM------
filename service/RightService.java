package com.hwua.service;

import java.util.List;

import com.hwua.entity.Employee;
import com.hwua.entity.Rights;

public interface RightService {
   List<Rights> selectByExample(Employee employee);
}

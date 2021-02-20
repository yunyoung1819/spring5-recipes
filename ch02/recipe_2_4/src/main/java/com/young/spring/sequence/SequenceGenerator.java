package com.young.spring.sequence;

import javax.annotation.Resource;
import javax.inject.Inject;

public class SequenceGenerator {

//    @Resource
//    private PrefixGenerator prefixGenerator;
    @Inject @DatePrefixAnnotation
    private PrefixGenerator prefixGenerator;
}

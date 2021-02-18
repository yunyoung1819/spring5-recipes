package com.young.springrecipes.sequence;

@Component
public class SequenceService {

    @Autowired
    private SequenceDao sequenceDao;

    /**
     * 배열형 프로퍼티에 @Autowired를 붙이면 스프링은 매치된 빈을 찾아 자동 연결합니다.
     */
//    @Autowired
//    private PrefixGenerator[] prefixGenerators;

    public void setSequenceDao(SequenceDao seqeunceDao) {
        this.sequenceDao = seqeunceDao;
    }

    public String generate(String sequenceId) {
        Sequence seqeunce = sequenceDao.getSequence(sequenceId);
        int value = sequenceDao.getNextValue();
        return seqeunce.getPrefix() + value + seqeunce.getSuffix();
    }
}

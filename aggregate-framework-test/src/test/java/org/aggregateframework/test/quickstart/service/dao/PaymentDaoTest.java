package org.aggregateframework.test.quickstart.service.dao;

import com.google.common.collect.Lists;
import org.aggregateframework.test.AbstractTestCase;
import org.aggregateframework.test.quickstart.command.domain.entity.Payment;
import org.aggregateframework.test.quickstart.command.infrastructure.dao.PaymentDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by zhuoshangyi on 2017/3/19.
 */
public class PaymentDaoTest extends AbstractTestCase {

    @Autowired
     private PaymentDao paymentDao;

    @Test
    public void testBatchUpdate() throws Exception {

        List<Payment> payments = paymentDao.findByIds(Lists.newArrayList(1L, 2L));

        payments.forEach((payment)-> payment.setStatusId(4));

        int updateCount = paymentDao.updateAll(payments);

        System.out.println("###  Total Updated : "+updateCount);


    }
}

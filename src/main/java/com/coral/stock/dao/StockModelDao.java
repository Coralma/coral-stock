package com.coral.stock.dao;

import com.cccis.base.mongo.MBaseDao;
import com.coral.stock.model.StockModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CCC on 2016/12/27.
 */
@Repository(StockModelDao.SPRING_BEAN_NAME)
public class StockModelDao extends MBaseDao<StockModel> {

    public final static String SPRING_BEAN_NAME = "mongo.dao.StockModelDao";

    public List<StockModel> getStockModels() {
        Query query = new Query(Criteria.where("status").is("1"));
        query.with(new Sort(new Sort.Order(Sort.Direction.ASC,"createDate")));
        return findByQuery(query);
    }

    public List<StockModel> loadAll() {
        return findAll();
    }

    public boolean isExistedUrl(String url) {
        Query query = new Query(Criteria.where("url").is(url));
        List<StockModel> crawlURLs = findByQuery(query);
        return crawlURLs.size() != 0;
    }

    @Override
    public Class getEntityClass() {
        return StockModel.class;
    }
}

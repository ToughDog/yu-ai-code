package com.yupi.yuaicode.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.yupi.yuaicode.model.dto.app.AppQueryRequest;
import com.yupi.yuaicode.model.entity.App;
import com.yupi.yuaicode.model.entity.User;
import com.yupi.yuaicode.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author Administrator
 */
public interface AppService extends IService<App> {


    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);
}

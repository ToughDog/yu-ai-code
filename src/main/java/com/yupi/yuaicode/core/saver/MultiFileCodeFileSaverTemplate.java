package com.yupi.yuaicode.core.saver;

import cn.hutool.core.util.StrUtil;
import com.yupi.yuaicode.ai.model.HtmlCodeResult;
import com.yupi.yuaicode.ai.model.MultiFileCodeResult;
import com.yupi.yuaicode.ai.model.enums.CodeGenTypeEnum;
import com.yupi.yuaicode.exception.BusinessException;
import com.yupi.yuaicode.exception.ErrorCode;

public class MultiFileCodeFileSaverTemplate extends CodeFileSaverTemplate<MultiFileCodeResult>{
    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.MULTI_FILE;
    }

    @Override
    protected void saveFiles(MultiFileCodeResult result, String baseDirPath) {
        // 保存 HTML 文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
        writeToFile(baseDirPath, "style.css", result.getHtmlCode());
        writeToFile(baseDirPath, "script.js", result.getHtmlCode());
    }

    @Override
    protected void validateInput(MultiFileCodeResult result) {
        super.validateInput(result);
        // HTML 代码不能为空
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML代码内容不能为空");
        }
    }
}

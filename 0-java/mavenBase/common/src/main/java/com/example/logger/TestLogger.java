package com.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WawaGuess
 * @project codeExample
 * @Date 2022/7/3
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
public class TestLogger {
    private static final Logger log = LoggerFactory.getLogger(TestLogger.class);

    public static void main(String[] args) {
        log.info("info-{}", "info");
        log.debug("debug");
        log.error("error");
        log.trace("trace");
        log.warn("warning");
        log.info("info");
    }
}

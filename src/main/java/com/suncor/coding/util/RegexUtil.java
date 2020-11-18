package com.suncor.coding.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author sunc
 * @Description 正则工具类
 * @info com.makepower.sqlformat RegexUtil 2019/4/3 9:24
 */
public class RegexUtil {

    public static String getMatcher(String regex, String source) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            result = matcher.group();
            break;
        }
        return result;
    }

    public static List<String> getMatcherList(String regex, String source) {
        List<String> list = Lists.newArrayList();
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            result = matcher.group();
            list.add(result);
        }
        return list;
    }

    public static Map<String, String> getMatcherMap(String regex, String source) {
        Map<String, String> map = Maps.newHashMap();
        String value = "";
        String key = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            key = matcher.group(1).trim();
            value = matcher.group(2).trim();
            map.put(key, value);
        }
        return map;
    }

    public static List<String> listMatcherList(String regex, List<String> list) {
        List<String> results = Lists.newArrayList();
        String result = "";
        for (String source : list) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(source);
            while (matcher.find()) {
                result = matcher.group();
                if (StringUtils.isNotBlank(result)) {
                    results.add(result);
                }
                break;
            }
        }

        return results;
    }

    public static Integer getMatcherCount(String regex, String source) {
        Integer count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            count += 1;
        }
        return count;
    }
}

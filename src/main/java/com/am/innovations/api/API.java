package com.am.innovations.api;

import java.util.function.BiFunction;

import com.am.innovations.validations.SYMBOLS;
import com.google.common.base.Function;

public interface API {
    String CONTEXT_PATH = "/";

    interface Version {
        String PREFIX = "V" + SYMBOLS.UNDERSCORE;
        String MAJOR[] = { "0", "1", "2", "3", "4", "5" };
        String MINOR[] = { ".0", ".1", ".2", ".3", ".4", ".5" };
    }

    interface CRUD {

        enum CREATE {
            ADD, SAVE, POST, MAKE, BUILD;
        }

        enum RETRIEVE {
            GET, FIND, ALL;
        }

        enum UPDATE {
            UPDATE, PUT, MODIFY, MEND, FIX, REPAIR;
        }

        enum DELETE {
            DELETE, REMOVE, ALL;
        }

        Function<Enum, String> METHOD_WITH_SLASH_PREFIX = (input) -> SYMBOLS.SLASH.getVal()
                + input.name().toLowerCase();

    }

    BiFunction<Integer, Integer, String> VERSION = (major, minor) -> API.CONTEXT_PATH
            .concat(Version.PREFIX.concat(Version.MAJOR[major]).concat(Version.MAJOR[minor]));

}
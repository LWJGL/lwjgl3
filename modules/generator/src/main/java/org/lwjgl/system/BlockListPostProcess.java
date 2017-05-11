/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

final class BlockListPostProcess {

    /*
    Group 1: Link reference
    Group 2: Field/method dname
    Group 3: Code
    Group 4: Documentation
     */
    private static final Pattern BLOCKS = Pattern.compile(
        "<a id=\"([^\"]+)\">(\\s*.+\\s*)</a>\\s+" +
        "(<ul class=\"blockList(?:Last)?\">\\s+<li class=\"blockList\">\\s+)" +
        "<h4>([^<]+)</h4>\\s+" +
        "<pre>([\\s\\S]+?)</pre>\\s+" +
        "([\\s\\S]+?)(?:<dl>\\s+" +
        "<dt><span class=\"seeLabel\">[^<]+</span></dt>\\s+" +
        "<dd><a href=\"([^\"]+)\">[^<]+</a></dd>\\s+" +
        "</dl>\\s+)?</li>\\s+</ul>\\s+" +
        "(?=<a id=\"|</li>\\s+</ul>)"
    );

    private BlockListPostProcess() {
    }

    static String process(String html) {
        Matcher m = BLOCKS.matcher(html);

        List<Match> matches   = new ArrayList<>(64);
        Match       lastMatch = null;

        boolean foundSame = false;

        StringBuilder out = new StringBuilder(html.length());
        while (m.find()) {
            if (lastMatch == null) {
                out.append(html.substring(0, m.start()));

                matches.add(lastMatch = new Match(m));
                continue;
            }

            Match match = new Match(m);
            if (match.isSameBlock(lastMatch)) {
                foundSame = true;
                matches.add(lastMatch = match);
                continue;
            }

            flush(out, matches);

            if (lastMatch.end != match.start) {
                out.append(html.substring(lastMatch.end, match.start));
            }

            matches.clear();
            matches.add(lastMatch = match);
        }

        if (foundSame) {
            flush(out, matches);

            out.append(html.substring(matches.get(matches.size() - 1).end));

            return out.toString();
        }

        return html;
    }

    private static void flush(StringBuilder out, List<Match> matches) {
        boolean methods = matches.stream().anyMatch(match -> match.code.indexOf('(') != -1);

        if (matches.size() == 1 && methods) {
            out.append(matches.get(0).original);
            return;
        }

        List<Match> distinct = matches.stream()
            .distinct()
            .collect(Collectors.toList());

        distinct.forEach(match -> out
            .append("<a id=\"")
            .append(match.link)
            .append("\">")
            .append(match.linkContents)
            .append("</a>\n")
        );

        out
            .append(distinct.get(distinct.size() - 1).block)
            .append("<h4>")
            .append(distinct.stream()
                .map(match -> match.seeAlso == null
                    ? match.name
                    : "<a href=\"" + match.seeAlso + "\">" + match.name + "</a>"
                )
                .distinct()
                .collect(Collectors.joining(", "))
            )
            .append("</h4>\n");

        if (methods) {
            out
                .append("<pre>")
                .append(distinct.stream()
                    .map(match -> match.code + "\n")
                    .collect(Collectors.joining("\n"))
                )
                .append("</pre>\n");
        }

        out
            .append(distinct.get(0).documentation)
            .append("</li></ul>\n");
    }

    private static class Match {

        final String original;
        final int    start;
        final int    end;

        final String link;
        final String linkContents;
        final String block;
        final String name;
        final String code;
        final String documentation;
        final String seeAlso;

        Match(Matcher matcher) {
            this.original = matcher.group(0);
            this.start = matcher.start();
            this.end = matcher.end();

            this.link = matcher.group(1);
            this.linkContents = matcher.group(2);
            this.block = matcher.group(3);
            this.name = matcher.group(4);
            this.code = matcher.group(5);
            this.documentation = matcher.group(6);
            this.seeAlso = matcher.group(7);
        }

        boolean isSameBlock(Match other) {
            return this.start == other.end && this.documentation.equals(other.documentation);
        }

    }

}
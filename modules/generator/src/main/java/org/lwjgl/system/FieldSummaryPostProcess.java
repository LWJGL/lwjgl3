/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;
import java.util.regex.*;

final class FieldSummaryPostProcess {

    /*
    Group 1: Row class
    Group 2: Field type
    Group 3: Link URL
    Group 4: Field name
    Group 5: Comment
        Group 6: Comment block inner HTML
    Group 7: Line feed
     */
    private static final Pattern FIELD = Pattern.compile(
        "<tr\\s+class=\"(\\w+)\">\\s*" +
        "<td\\s+class=\"colFirst\"><code>([^<]+)</code></td>\\s*" +
        "<td\\s+class=\"colLast\"><code><span\\s+class=\"memberNameLink\"><a href=\"([^\"]+)\">\\s*(\\w+)\\s*</a></span></code>\\s*" +
        "(&nbsp;|<div\\s+class=\"block\">(.+?)</div>)\\s*" +
        "</td>\\s*" +
        "</tr>(\\s*)",
        Pattern.DOTALL
    );

    private FieldSummaryPostProcess() {
    }

    static String process(String html) {
        Matcher m = FIELD.matcher(html);

        List<Match> matches   = new ArrayList<>(64);
        Match       lastMatch = null;

        boolean foundSame = false;

        StringBuilder out      = new StringBuilder(html.length());
        boolean       altColor = false;
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

            flush(out, matches, altColor = !altColor);

            matches.clear();
            matches.add(lastMatch = match);
        }

        if (foundSame) {
            flush(out, matches, !altColor);

            out.append(html.substring(matches.get(matches.size() - 1).end));

            return out.toString();
        }

        return html;
    }

    private static void flush(StringBuilder out, List<Match> matches, boolean altColor) {
        Match ref = matches.get(0);

        if (matches.size() == 1 && ref.rowClass.equals(altColor ? "altColor" : "rowColor")) {
            out.append(ref.original);
            return;
        }

        out
            .append("<tr class=\"")
            .append(altColor ? "altColor" : "rowColor")
            .append("\">\n<td class=\"colFirst\"><code>")
            .append(ref.type)
            .append("</code></td>\n<td class=\"colLast\"><code><span class=\"memberNameLink\">");

        for (Match contiguous : matches) {
            if (contiguous != ref) {
                out.append("\n<br>");
            }

            out.append("<a href=\"")
                .append(contiguous.link)
                .append("\">")
                .append(contiguous.name)
                .append("</a>");
        }

        out.append("</span></code>");

        if (ref.comment.isEmpty()) {
            out.append("&nbsp;");
        } else {
            out
                .append("\n<div class=\"block\">")
                .append(ref.comment)
                .append("</div>\n");
        }

        out
            .append("</td>\n</tr>")
            .append(ref.nl);
    }

    private static class Match {

        final String original;
        final int    start;
        final int    end;

        final String rowClass;
        final String type;
        final String link;
        final String name;
        final String comment;
        final String nl;

        Match(Matcher matcher) {
            this.original = matcher.group(0);
            this.start = matcher.start();
            this.end = matcher.end();

            this.rowClass = matcher.group(1);
            this.type = matcher.group(2);
            this.link = matcher.group(3);
            this.name = matcher.group(4);
            this.comment = "&nbsp;".equals(matcher.group(5)) ? "" : matcher.group(6);
            this.nl = matcher.group(7);
        }

        boolean isSameBlock(Match other) {
            return this.start == other.end && this.type.equals(other.type) && this.comment.equals(other.comment);
        }

    }

}
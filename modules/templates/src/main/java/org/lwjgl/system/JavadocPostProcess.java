/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Processes the "Field Summary" section of Javadoc-generated HTML files, to group contiguous fields having the same Javadoc comment. */
public final class JavadocPostProcess {

	private JavadocPostProcess() {
	}

	public static void main(String[] args) {
		if ( args.length == 0 )
			throw new IllegalArgumentException("Root directory not specified.");

		File root = new File(args[0]);
		if ( !root.isDirectory() )
			throw new IllegalArgumentException("Invalid root directory specified.");

		process(root);
	}

	private static void process(File file) {
		File[] files = file.listFiles();

		int count = 0;
		for ( File f : files ) {
			if ( f.isFile() && f.getName().endsWith(".html") )
				count += doProcess(f) ? 1 : 0;
		}

		if ( count != 0 )
			System.out.println("PROCESSED: " + file.getPath() + " (" + count + " files)");

		for ( File f : files ) {
			if ( f.isDirectory() )
				process(f);
		}
	}

	private static boolean doProcess(File file) {
		String html;
		try {
			html = new Scanner(file, "UTF-8").useDelimiter("\\Z").next();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		/*
		Group 1: Row class
		Group 2: Field type
		Group 3: Link URL
		Group 4: Field name
		Group 5: Comment
			Group 6: Comment block inner HTML
		Group 7: Line feed
		 */
		Pattern p = Pattern.compile(
			"<tr\\s+class=\"(\\w+)\">\\s*" +
				"<td\\s+class=\"colFirst\"><code>([^<]+)</code></td>\\s*" +
				"<td\\s+class=\"colLast\"><code><span\\s+class=\"memberNameLink\"><a href=\"([^\"]+)\">\\s*(\\w+)\\s*</a></span></code>\\s*" +
				"(&nbsp;|<div\\s+class=\"block\">(.+?)</div>)\\s*" +
				"</td>\\s*" +
				"</tr>(\\s*)",
			Pattern.DOTALL
		);

		Matcher m = p.matcher(html);

		List<Match> matches = new ArrayList<Match>(64);
		Match lastMatch = null;

		boolean foundSame = false;

		StringBuilder out = new StringBuilder(html.length());
		boolean altColor = false;
		while ( m.find() ) {
			if ( lastMatch == null ) {
				out.append(html.substring(0, m.start()));

				matches.add(lastMatch = new Match(m));
				continue;
			}

			Match match = new Match(m);
			if ( match.isSameBlock(lastMatch) ) {
				foundSame = true;
				matches.add(lastMatch = match);
				continue;
			}

			flush(out, matches, altColor = !altColor);

			matches.clear();
			matches.add(lastMatch = match);
		}

		if ( foundSame ) {
			int lastMatchEnd = matches.get(matches.size() - 1).end;

			flush(out, matches, !altColor);

			try {
				Writer w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

				w.write(out.toString());
				w.write(html, lastMatchEnd, html.length() - lastMatchEnd);

				w.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			return true;
		}

		return false;
	}

	private static void flush(StringBuilder out, List<Match> matches, boolean altColor) {
		Match ref = matches.get(0);

		if ( matches.size() == 1 && ref.rowClass.equals(altColor ? "altColor" : "rowColor") ) {
			out.append(ref.original);
			return;
		}

		out
			.append("<tr class=\"")
			.append(altColor ? "altColor" : "rowColor")
			.append("\">\n<td class=\"colFirst\"><code>")
			.append(ref.type)
			.append("</code></td>\n<td class=\"colLast\"><code><span class=\"memberNameLink\">");

		for ( Match contiguous : matches ) {
			if ( contiguous != ref )
				out.append("\n<br>");

			out.append("<a href=\"")
				.append(contiguous.link)
				.append("\">")
				.append(contiguous.name)
				.append("</a>");
		}

		out.append("</span></code>");

		if ( ref.comment.isEmpty() )
			out.append("&nbsp;");
		else
			out
				.append("\n<div class=\"block\">")
				.append(ref.comment)
				.append("</div>\n");

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
			this.comment = matcher.group(5).equals("&nbsp;") ? "" : matcher.group(6);
			this.nl = matcher.group(7);
		}

		boolean isSameBlock(Match other) {
			return this.start == other.end && this.type.equals(other.type) && this.comment.equals(other.comment);
		}

	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator.util.vulkan;

import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class VulkanFormatter {

	private final JTextArea input;
	private final JTextArea output;

	private VulkanFormatter() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		JFrame frame = new JFrame("Vulkan Formatter");
		frame.getContentPane().setLayout(new BorderLayout(4, 4));

		// Text areas

		Font font = new Font(Font.MONOSPACED, Font.PLAIN, 14);

		input = new JTextArea(32, 64);
		input.setFont(font);
		input.setLineWrap(false);
		input.setTabSize(4);

		output = new JTextArea(32, 64);
		output.setFont(font);
		output.setLineWrap(false);
		output.setTabSize(4);
		output.setBackground(Color.LIGHT_GRAY);
		output.setEditable(false);

		setup();

		frame.getContentPane().add(new JSplitPane(
			JSplitPane.HORIZONTAL_SPLIT,
			true,
			new JScrollPane(input),
			new JScrollPane(output)
		), BorderLayout.CENTER);

		// Config and show

		try {
			ClassLoader cl = getClass().getClassLoader();
			frame.setIconImages(Arrays.asList(new Image[] {
				ImageIO.read(cl.getResource("lwjgl16.png")),
				ImageIO.read(cl.getResource("lwjgl32.png"))
			}));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setState(Frame.MAXIMIZED_BOTH);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new VulkanFormatter();
	}

	private void setup() {
		input.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				format();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				format();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				format();
			}
		});
	}

	private void format() {
		String inputText = input.getText().trim();
		if ( inputText.isEmpty() ) {
			output.setBackground(Color.LIGHT_GRAY);
			output.setText("");
			return;
		}

		try {
			String outputText = formatValidation(inputText, "\t\t");

			output.setBackground(Color.WHITE);
			output.setText(outputText);

			// Copy output to clipboard
			//final StringSelection copyData = new StringSelection(outputText);
			//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyData, copyData);
		} catch (Exception e) {
			e.printStackTrace();

			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));

			output.setBackground(Color.ORANGE);
			output.setText("** ERROR **\n\n" + writer.toString());
		}
	}

	// ---[ VALIDITY FORMATTING ]----

	private static final Pattern VALIDITY = Pattern.compile("^[*]\\s+(.+)", Pattern.MULTILINE);

	private static final Pattern ESCAPE = Pattern.compile("\\\\|[$]");

	private static final Pattern KEYWORD      = Pattern.compile("(must|mustnot|should|shouldnot|may|can|cannot):(\\s+)");
	private static final Pattern NULL         = Pattern.compile("`NULL`");
	private static final Pattern STRUCT_FIELD = Pattern.compile("sname:(\\w+)::pname:(\\w+)");
	private static final Pattern NUMBER       = Pattern.compile("`(\\d+)`|code:(\\d+)");
	private static final Pattern CODE1        = Pattern.compile("(?<=\\s)([`_])(?!\\d+\\1)(.+?)\\1");
	private static final Pattern FUNCTION     = Pattern.compile("(?:fname|flink):vk(\\w+)");
	private static final Pattern ENUM         = Pattern.compile("(?:[se]name|dlink):VK_(\\w+)");
	private static final Pattern STRUCT       = Pattern.compile("sname:(\\w+)(\\s+)struct");
	private static final Pattern CODE2        = Pattern.compile("(?:pname|basetype|elink|code|sname|slink):(\\w+(?:[.]\\w+)*)");
	private static final Pattern LINK         = Pattern.compile("<<[^,\n]+,\\s*([^>]+?)>>");
	private static final Pattern EXTENSION    = Pattern.compile("[+](\\w+)[+]");

	private static final Pattern SECTION_LINK = Pattern.compile("(?:\\s*[,\\-])?\\s*[(]?(?:as described[^<]+<<[^>]+>>|see <<[^>]+>>)[)]?");

	static String formatValidation(String input, String prefix) {
		return formatValidation(input, prefix, "Valid Usage");
	}

	static String formatValidation(String input, String prefix, String title) {
		input = ESCAPE.matcher(input).replaceAll("\\\\$0");

		input = KEYWORD.matcher(input).replaceAll("\\$$1$2");
		input = NULL.matcher(input).replaceAll("\\$NULL");
		input = STRUCT_FIELD.matcher(input).replaceAll("##$1{@code ::$2}");
		input = NUMBER.matcher(input).replaceAll("$1$2");
		input = CODE1.matcher(input).replaceAll("{@code $2}");
		input = FUNCTION.matcher(input).replaceAll("#$1()");
		input = ENUM.matcher(input).replaceAll("#$1");
		input = STRUCT.matcher(input).replaceAll("##$1$2struct");
		input = CODE2.matcher(input).replaceAll("{@code $1}");
		input = LINK.matcher(input).replaceAll("$1");
		input = SECTION_LINK.matcher(input).replaceAll("");
		input = EXTENSION.matcher(input).replaceAll("{@code $1}");

		StringBuilder builder = new StringBuilder(input.length());

		builder
			.append(prefix)
			.append("<h5>")
			.append(title)
			.append("</h5>\n")
			.append("\t\t${ul(");

		Matcher m = VALIDITY.matcher(input);

		boolean matches = m.find();
		while ( matches ) {
			if ( m.start() != 0 )
				builder.append(',');

			String line = m.group(1);
			matches = m.find();
			append(builder, line, !matches);
		}

		return builder.append("\n\t\t)}").toString();
	}

	private static final Pattern PARAGRAPH = Pattern.compile("(?<!\\{@code)\\s+");

	private static void append(StringBuilder builder, String match, boolean last) {
		boolean multiLine = 160 <= (last ? 14 : 15) + match.length();

		builder
			.append("\n\t\t\t")
			.append(multiLine ? "\"\"\"\n\t\t\t" : "\"");

		if ( multiLine ) {
			Matcher m = PARAGRAPH.matcher(match);

			int lastMatch = 0;
			int lineLen = 12;
			while ( m.find() ) {
				String word = match.substring(lastMatch, m.start());

				if ( 160 <= lineLen + word.length() + 1 ) {
					builder.append("\n\t\t\t");
					lineLen = 12;

					builder.append(word);
					lineLen += word.length();
				} else {
					if ( lastMatch != 0 ) {
						builder.append(' ');
						lineLen++;
					}

					builder.append(word);
					lineLen += word.length();
				}

				lastMatch = m.end();
			}

			String tail = match.substring(lastMatch);
			if ( 160 <= lineLen + tail.length() + 1 )
				builder.append("\n\t\t\t");
			else if ( lastMatch != 0 )
				builder.append(' ');

			builder.append(tail);
		} else
			builder.append(match);

		builder.append(multiLine ? "\n\t\t\t\"\"\"" : "\"");
	}

}
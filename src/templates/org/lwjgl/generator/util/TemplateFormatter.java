/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.util;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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

public class TemplateFormatter {

	final JRadioButton radioConst;
	final JRadioButton radioFunc;

	private final JTextArea input;
	private final JTextArea output;

	private TemplateFormatter() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		final JFrame frame = new JFrame("Template Formatter");
		frame.getContentPane().setLayout(new BorderLayout(4, 4));

		// Radio buttons

		radioConst = new JRadioButton("Constants", true);
		radioFunc = new JRadioButton("Functions");

		final ButtonGroup radioGroup = new ButtonGroup();

		radioGroup.add(radioConst);
		radioGroup.add(radioFunc);

		final JPanel radioPane = new JPanel(new FlowLayout());
		radioPane.add(radioConst);
		radioPane.add(radioFunc);

		frame.getContentPane().add(radioPane, BorderLayout.NORTH);

		// Text areas

		final Font font = new Font(Font.MONOSPACED, Font.PLAIN, 14);

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
			frame.setIconImages(Arrays.asList(new Image[] {
				ImageIO.read(new File("res/lwjgl16.png")),
				ImageIO.read(new File("res/lwjgl32.png")),
			}));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new TemplateFormatter();
	}

	private void setup() {
		input.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(final DocumentEvent e) {
				format();
			}

			public void removeUpdate(final DocumentEvent e) {
				format();
			}

			public void changedUpdate(final DocumentEvent e) {
				format();
			}
		});

		final ActionListener radioAction = new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				format();
			}
		};

		radioConst.addActionListener(radioAction);
		radioFunc.addActionListener(radioAction);
	}

	private void format() {
		final String inputText = input.getText().trim();
		if ( inputText.isEmpty() ) {
			output.setBackground(Color.LIGHT_GRAY);
			output.setText("");
			return;
		}

		try {
			String outputText = radioConst.isSelected() ? formatConstants(inputText) : formatFunctions(inputText);

			// Try to automatically detect the input type
			if ( outputText.isEmpty() ) {
				outputText = radioConst.isSelected() ? formatFunctions(inputText) : formatConstants(inputText);
				// Got it, flip the selection
				if ( !outputText.isEmpty() )
					(radioConst.isSelected() ? radioFunc : radioConst).setSelected(true);
			}

			if ( outputText.isEmpty() ) {
				output.setBackground(Color.ORANGE);
				output.setText("** PARSE ERROR **");
			} else {
				output.setBackground(Color.WHITE);
				output.setText(outputText);

				// Copy output to clipboard
				//final StringSelection copyData = new StringSelection(outputText);
				//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyData, copyData);
			}
		} catch (Exception e) {
			e.printStackTrace();

			final StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));

			output.setBackground(Color.ORANGE);
			output.setText("** ERROR **\n\n" + writer.toString());
		}
	}

	// ---[ CONSTANT FORMATTING ]----

	private static final Pattern BLOCK_PATTERN = Pattern.compile(
		"([^:]+):\\s+((?:\\s*[0-9A-Za-z_]+\\s+[0-9xA-Fa-f]+\\s*$)+)\\s*",
		Pattern.MULTILINE
	);

	private static final Pattern COMMENT_CLEANUP = Pattern.compile("$\\s+", Pattern.MULTILINE);
	private static final Pattern CODE_CLEANUP    = Pattern.compile("<([^>]+)>");
	private static final Pattern TOKEN_SPLIT     = Pattern.compile("(?<!@code)\\s+"); // Don't split code fragments

	private static final Pattern CONSTANT_PATTERN = Pattern.compile(
		"([0-9A-Za-z_]+)\\s+([0-9xA-Fa-f]+)"
	);

	private static String formatConstants(final String input) {
		final StringBuilder builder = new StringBuilder(input.length());

		final Matcher blockMatcher = BLOCK_PATTERN.matcher(input);
		int blockCount = 0;
		while ( blockMatcher.find() ) {
			if ( 0 < blockCount++ ) builder.append('\n');

			final String description =
				CODE_CLEANUP.matcher(
					COMMENT_CLEANUP.matcher(blockMatcher.group(1)).replaceAll(" ")
				).replaceAll("{@code $1}") + '.';

			builder.append("\tIntConstant.block(\n");
			if ( description.length() <= 160 - (4 + 4 + 2 + 1) ) {
				builder.append("\t\t\"");
				builder.append(description);
				builder.append('\"');
			} else {
				builder.append("\t\t\"\"\"\n");
				builder.append("\t\t");

				final String[] tokens = TOKEN_SPLIT.split(description);
				int MAX_LINE_LENGTH = 160 - (4 + 4);

				int lineLength = 0;
				for ( final String token : tokens ) {
					lineLength += token.length();
					if ( token.length() < lineLength ) {
						if ( MAX_LINE_LENGTH < 1 + lineLength ) {
							builder.append("\n\t\t");
							lineLength = token.length();
						} else {
							builder.append(' ');
							lineLength++;
						}
					}

					builder.append(token);
				}

				builder.append("\n\t\t\"\"\"");
			}
			builder.append(",\n\n");

			final Matcher constantMatcher = CONSTANT_PATTERN.matcher(blockMatcher.group(2));
			int constCount = 0;
			while ( constantMatcher.find() ) {
				if ( 0 < constCount++ ) builder.append(",\n");

				builder.append("\t\t\"");
				builder.append(constantMatcher.group(1));
				builder.append("\" _ ");
				builder.append(constantMatcher.group(2));
			}

			builder.append("\n\t)\n");
		}

		return builder.toString();
	}

	// ---[ FUNCTION FORMATTING ]----

	private static final Pattern TYPE_PATTERN = Pattern.compile(
		// This is a little funny because we can have whitespace on either side of *
		"(?:const\\s+)?[a-zA-Z]+(?:(?:\\s*[*]+\\s*)|\\s+)[0-9a-zA-Z_]+"
	);

	private static final Pattern FUNCTION_PATTERN = Pattern.compile(
		TYPE_PATTERN + "[(](?:,?\\s*" + TYPE_PATTERN + ")*\\s*[)]",
		Pattern.MULTILINE
	);

	// Same as TYPE_PATTERN, with capturing groups and without the whitespace stuff (we've already verified correct syntax)
	private static final Pattern PARAM_PATTERN = Pattern.compile(
		"(const\\s+)?([a-zA-Z]+)\\s*([*]+)?\\s*([0-9a-zA-Z_]+)",
		Pattern.MULTILINE
	);

	private static String formatFunctions(final String input) {
		final StringBuilder builder = new StringBuilder(input.length());

		final Matcher funcMatcher = FUNCTION_PATTERN.matcher(input);

		int funcCount = 0;
		while ( funcMatcher.find() ) {
			if ( 0 < funcCount++ ) builder.append("\n\n");

			final String function = funcMatcher.group();

			final Matcher paramMatcher = PARAM_PATTERN.matcher(function);

			int paramCount = -1;
			while ( paramMatcher.find() ) {
				if ( paramCount == -1 ) {
					// Return type + function name
					builder.append('\t');
					if ( paramMatcher.group(1) != null )
						builder.append("(const _ ");

					if ( !paramMatcher.group(2).startsWith("GL") )
						builder.append("GL");
					builder.append(paramMatcher.group(2));
					if ( paramMatcher.group(3) != null ) // pointer
						writerPointer(builder, paramMatcher);
					if ( paramMatcher.group(1) != null )
						builder.append(')');
					builder.append(".func(\n");
					builder.append("\t\t\"");
					builder.append(paramMatcher.group(4));
					builder.append("\",\n");
					builder.append("\t\t\"\",\n\n");

					paramCount = 0;
				} else {
					// Normal parameter
					if ( 0 < paramCount++ ) builder.append(",\n");

					builder.append("\t\t");
					if ( paramMatcher.group(1) != null ) // const
						builder.append("const _ ");
					if ( !paramMatcher.group(2).startsWith("GL") )
						builder.append("GL");
					builder.append(paramMatcher.group(2));
					if ( paramMatcher.group(3) != null ) // pointer
						writerPointer(builder, paramMatcher);
					builder.append(".IN(\"");
					builder.append(paramMatcher.group(4));
					builder.append("\", \"\")");
				}
			}

			builder.append("\n\t)");
		}

		return builder.toString();
	}

	private static void writerPointer(final StringBuilder builder, final Matcher paramMatcher) {
		builder.append('_');
		for ( int i = 0; i < paramMatcher.group(3).length(); i++ )
			builder.append('p');
	}

}
/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator.util;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	final JTextField prefix;

	private final JTextArea input;
	private final JTextArea output;

	private TemplateFormatter() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}

		JFrame frame = new JFrame("Template Formatter");
		frame.getContentPane().setLayout(new BorderLayout(4, 4));

		// Settings

		radioConst = new JRadioButton("Constants", true);
		radioFunc = new JRadioButton("Functions");

		prefix = new JTextField("GL", 4);

		ButtonGroup radioGroup = new ButtonGroup();

		radioGroup.add(radioConst);
		radioGroup.add(radioFunc);

		JPanel radioPane = new JPanel(new FlowLayout());
		radioPane.add(radioConst);
		radioPane.add(radioFunc);
		radioPane.add(new JLabel("Prefix:"));
		radioPane.add(prefix);

		frame.getContentPane().add(radioPane, BorderLayout.NORTH);

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
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
			frame.setIconImages(Arrays.asList(new Image[] {
				ImageIO.read(cl.getResource("lwjgl16.png")),
				ImageIO.read(cl.getResource("lwjgl32.png")),
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
			public void insertUpdate(DocumentEvent e) {
				format();
			}

			public void removeUpdate(DocumentEvent e) {
				format();
			}

			public void changedUpdate(DocumentEvent e) {
				format();
			}
		});

		ActionListener settingsAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				format();
			}
		};

		radioConst.addActionListener(settingsAction);
		radioFunc.addActionListener(settingsAction);

		prefix.addActionListener(settingsAction);
	}

	private void format() {
		String inputText = input.getText().trim();
		if ( inputText.isEmpty() ) {
			output.setBackground(Color.LIGHT_GRAY);
			output.setText("");
			return;
		}

		try {
			String outputText = radioConst.isSelected() ? formatConstants(inputText, prefix.getText()) : formatFunctions(inputText, prefix.getText());

			// Try to automatically detect the input type
			if ( outputText.isEmpty() ) {
				outputText = radioConst.isSelected() ? formatFunctions(inputText, prefix.getText()) : formatConstants(inputText, prefix.getText());
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

			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));

			output.setBackground(Color.ORANGE);
			output.setText("** ERROR **\n\n" + writer.toString());
		}
	}

	// ---[ CONSTANT FORMATTING ]----

	private static final String BLOCK_COMMENT = "(?:/[*]+.+?[*]+/)?";

	private static final String DESCRIPTION    = "(?:(?:/[*]+\\s*(.+?)\\s*[*]+/)|(?:([^:]+:)))";
	private static final String DEFINE         = "(?:#define\\s+)?";
	private static final String CONSTANT_VALUE = "(?:[-x\\p{XDigit}]+L?)|(?:\\([^)]+\\))";

	private static final Pattern BLOCK_PATTERN = Pattern.compile(
		DESCRIPTION + "\\s+((?:\\s*" + DEFINE + "[0-9A-Za-z_]+\\s+(?:" + CONSTANT_VALUE + ")[ \t]*" + BLOCK_COMMENT + "\\s*$)+)\\s*",
		Pattern.MULTILINE | Pattern.DOTALL
	);

	private static final Pattern COMMENT_CLEANUP = Pattern.compile("[\n\n]*(?:\\s*[*])?\\s+", Pattern.MULTILINE);
	private static final Pattern CODE_CLEANUP    = Pattern.compile("<([^>]+)>");
	private static final Pattern TOKEN_SPLIT     = Pattern.compile("(?<!@code)\\s+"); // Don't split code fragments

	private static final Pattern CONSTANT_PATTERN = Pattern.compile(
		DEFINE + "([0-9A-Za-z_]+)\\s+(" + CONSTANT_VALUE + ")[ \t]*" + BLOCK_COMMENT,
		Pattern.DOTALL
	);

	private static String formatConstants(String input, String prefix) {
		StringBuilder builder = new StringBuilder(input.length());

		Matcher blockMatcher = BLOCK_PATTERN.matcher(input);
		int blockCount = 0;
		while ( blockMatcher.find() ) {
			if ( 0 < blockCount++ ) builder.append('\n');

			String description = blockMatcher.group(1);
			if ( description == null )
				description = blockMatcher.group(2);

			description =
				CODE_CLEANUP.matcher(
					COMMENT_CLEANUP.matcher(description).replaceAll(" ").trim()
				).replaceAll("{@code $1}");

			builder.append("\tIntConstant.block(\n");
			if ( description.length() <= 160 - (4 + 4 + 2 + 1) ) {
				builder.append("\t\t\"");
				builder.append(description);
				builder.append('\"');
			} else {
				builder.append("\t\t\"\"\"\n");
				builder.append("\t\t");

				String[] tokens = TOKEN_SPLIT.split(description);
				int MAX_LINE_LENGTH = 160 - (4 + 4);

				int lineLength = 0;
				for ( String token : tokens ) {
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

			Matcher constantMatcher = CONSTANT_PATTERN.matcher(blockMatcher.group(3));
			int constCount = 0;
			while ( constantMatcher.find() ) {
				if ( 0 < constCount++ ) builder.append(",\n");

				String token = constantMatcher.group(1);
				if ( token.startsWith(prefix + '_') )
					token = token.substring(prefix.length() + 1);

				builder.append("\t\t\"");
				builder.append(token);

				String value = constantMatcher.group(2);

				try {
					String intValue = value.endsWith("L") ? value.substring(0, value.length() - 1) : value;

					Integer.decode(intValue);
					builder.append("\" _ ");
					builder.append(intValue);
				} catch (NumberFormatException e) {
					builder.append("\".expr<Int>(\"");
					builder.append(value.substring(1, value.length() - 1));
					builder.append("\")");
				}
			}
			builder.append("\n\t)\n");
		}

		return builder.toString();
	}

	// ---[ FUNCTION FORMATTING ]----

	private static final Pattern TYPE_PATTERN = Pattern.compile(
		// This is a little funny because we can have whitespace on either side of *
		"(?:const\\s+)?(?:unsigned\\s+)?[0-9a-zA-Z_]+(?:(?:\\s*[*]+\\s*)|\\s+)(?:/[*]\\s*)?[0-9a-zA-Z_]+(?:\\s*[*]/)?"
	);

	private static final Pattern FUNCTION_PATTERN = Pattern.compile(
		TYPE_PATTERN + "\\s*[(](?:,?\\s*" + TYPE_PATTERN + ")*\\s*(?:void\\s*)?[)]",
		Pattern.MULTILINE
	);

	// Same as TYPE_PATTERN, with capturing groups and without the whitespace stuff (we've already verified correct syntax)
	private static final Pattern PARAM_PATTERN = Pattern.compile(
		"(const\\s+)?((?:unsigned\\s+)?[0-9a-zA-Z_]+)\\s*([*]+)?\\s*(?:/[*]\\s*)?([0-9a-zA-Z_]+)(?:\\s*[*]/)?",
		Pattern.MULTILINE
	);

	private static String formatFunctions(String input, String prefix) {
		StringBuilder builder = new StringBuilder(input.length());

		Matcher funcMatcher = FUNCTION_PATTERN.matcher(input);

		int funcCount = 0;
		while ( funcMatcher.find() ) {
			if ( 0 < funcCount++ ) builder.append("\n\n");

			String function = funcMatcher.group();

			Matcher paramMatcher = PARAM_PATTERN.matcher(function);

			int paramCount = -1;
			while ( paramMatcher.find() ) {
				if ( paramCount == -1 ) {
					// Return type + function name
					builder.append('\t');
					if ( paramMatcher.group(1) != null )
						builder.append("(const _ ");

					if ( !paramMatcher.group(2).startsWith(prefix) )
						builder.append(prefix);
					builder.append(paramMatcher.group(2));
					if ( paramMatcher.group(3) != null ) // pointer
						writerPointer(builder, paramMatcher);
					if ( paramMatcher.group(1) != null )
						builder.append(')');
					builder.append(".func(\n");
					builder.append("\t\t\"");
					builder.append(paramMatcher.group(4));
					builder.append("\",\n");
					builder.append("\t\t\"\"");

					paramCount = 0;
				} else {
					// Normal parameter
					builder.append(",\n");
					if ( paramCount++ == 0 )
						builder.append('\n');

					builder.append("\t\t");
					if ( paramMatcher.group(1) != null ) // const
						builder.append("const _ ");
					if ( !paramMatcher.group(2).startsWith(prefix) )
						builder.append(prefix);
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

	private static void writerPointer(StringBuilder builder, Matcher paramMatcher) {
		builder.append('_');
		for ( int i = 0; i < paramMatcher.group(3).length(); i++ )
			builder.append('p');
	}

}
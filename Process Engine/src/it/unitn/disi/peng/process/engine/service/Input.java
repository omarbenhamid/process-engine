package it.unitn.disi.peng.process.engine.service;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

public class Input extends FormElement {
	EditText et;

	public Input(String id, String type, String value) {
		super(id, type, value);
	}

	public View getView(Context context) {
		et = new EditText(context);
		et.setText(value);
		return et;
	}

	public void updateValue() {
		value = et.getText().toString();
	}

}

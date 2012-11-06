package uk.co.senab.photup.views;

import uk.co.senab.photup.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UploadsActionBarView extends LinearLayout {

	public UploadsActionBarView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void updateProgress(final int progress, final int total) {
		ProgressBar pb = (ProgressBar) findViewById(R.id.pb_uploads_action);
		if (null != pb) {
			pb.setMax(100);
			pb.setProgress(Math.round(progress * 100f / total));
		}

		TextView tv = (TextView) findViewById(R.id.tv_uploads_action);
		if (null != tv) {
			tv.setText(getResources().getString(R.string.action_bar_upload_progress, progress, total).toUpperCase());
		}
	}
}

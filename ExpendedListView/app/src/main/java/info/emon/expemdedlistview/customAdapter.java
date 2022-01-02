package info.emon.expemdedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class customAdapter extends BaseExpandableListAdapter {
    private Context context;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChaild;

    public customAdapter(Context context, List<String> listDataHeader, HashMap<String, List<String>> listDataChaild) {
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listDataChaild = listDataChaild;
    }

    @Override
    public int getGroupCount() {
        return listDataChaild.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listDataChaild.get(listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listDataChaild.get(listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerText = (String) getGroup(groupPosition);
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.group_layout,null);

        }
        TextView textView = convertView.findViewById(R.id.headerTextViewID);
        textView.setText(headerText);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String chaildText = (String) getChild(groupPosition,childPosition);
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.chaild_layout,null);

        }
        TextView textView = convertView.findViewById(R.id.chaildTextViewID);
        textView.setText(chaildText);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}

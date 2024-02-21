package com.woafes.stu_economy.Activities;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.woafes.stu_economy.Models.Command;
import com.woafes.stu_economy.Models.Resource;
import com.woafes.stu_economy.R;
import com.woafes.stu_economy.ViewModels.CompCostViewModel;

import java.lang.reflect.Method;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private Command _command;
    private CompCostViewModel vm;

    private final String [] _resList = {"Наличные",
            "Победные очки",
            "Полувагоны (ПВ)",
            "Цистерны (Ц)",
            "Платформы (ПЛ)",
            "Крытые вагоны (КР)",
            "Порты Октябрьской ж.д.",
            "Порты Северо-Кавказской ж.д.",
            "Порты Дальневосточной ж.д.",
            "Каменный уголь",
            "Нефть и нефтепродукты",
            "Кокс",
            "Чёрные металлы",
            "Руда железная",
            "Строительные грузы",
            "Цемент",
            "Лес",
            "Химические грузы",
            "Зерновые",
            "Грузы в контейнерах",
    };

    public RecycleViewAdapter(CompCostViewModel viewModel){
        vm = viewModel;

        _command = vm.get_Command().getValue();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return _command.getClass().getFields().length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView value;
        ImageView image;
        public ViewHolder(View itemView){
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            value = (TextView) itemView.findViewById(R.id.value);
            image = (ImageView) itemView.findViewById(R.id.image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String _name = name.getText().toString();

                    AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                    alert.setTitle(R.string.editValues);
                    alert.setMessage("Введите новое значение для " + name.getText().toString());
                    EditText input = new EditText(v.getContext());
                    input.setInputType(InputType.TYPE_CLASS_NUMBER);

                    input.setText(value.getText().toString());
                    alert.setView(input);
                    alert.setPositiveButton(R.string.save, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            try {
                                String valS = input.getText().toString();
                                valS = valS.replaceAll("^0+","");
                                int val = Integer.parseInt(valS);
                                _command.getResByName(name.getText().toString()).set_value(val);
                                value.setText(String.valueOf(val));
                            }
                            catch (Exception e){
                                Toast.makeText(v.getContext(), "Проверьте правильность ввода и повторите попытку.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    alert.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                        }
                    });
                    alert.show();
                }
            });
        }

        void bind(int position){
            name.setText(String.valueOf(_command.getResByName(_resList[position]).getName()));
            //name.setText(_command.get_name());
            value.setText(String.valueOf(_command.getResByName(_resList[position]).get_value()));
            image.setImageResource(_command.getResByName(_resList[position]).get_icon());
        }
    }

}
